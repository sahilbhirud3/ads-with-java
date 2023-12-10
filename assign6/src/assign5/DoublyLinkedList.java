package assign5;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
	private static class Node {
		private int data;
		private Node next;
		private Node prev;

		public Node(int data) {
			this.data = data;
			this.prev = null;
			this.next = null;
			
		}
	}

	private Node head;

	public DoublyLinkedList() {
		this.head = null;
	}

	public void addAtBegin(int element) {
		Node newNode = new Node(element);

		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			head = newNode;
			newNode.next = temp;
			temp.prev=head;
		}
	}

	public void addAtEnd(int element) {
		Node newNode = new Node(element);
		if (head == null) {
			head = newNode;
		} else {
			Node temp;
			for (temp = head; temp.next != null; temp = temp.next)
				;
			temp.next = newNode;
			newNode.prev=temp;
		}
	}



	
	public void addAtSpecificPosition(int element, int position) {
	    Node newNode = new Node(element);
	    if (head == null) {
	        head = newNode;
	    } else {
	        Node temp = head;
	        int counter = 0;

	        while (counter < position - 1 && temp.next != null) {
	            temp = temp.next;
	            counter++;
	        }

	        newNode.next = temp.next;
	        if (temp.next != null) {
	            temp.next.prev = newNode;
	        }
	        temp.next = newNode;
	        newNode.prev = temp;
	    }
	}
	
	
	
	public int deleteAtBegin() {
		if (head == null) {
			throw new NoSuchElementException("List is empty.");
		} else {
			int data = head.data;
			head = head.next;
			head.prev=null;
			return data;
		}
	}

	public int deleteAtEnd() {
		if (head == null) {
			throw new NoSuchElementException("List is empty.");
		} else if (head.next == null) {
			int data = head.data;
			head = null;
			return data;
		} else {
			Node temp;
			for (temp = head; temp.next.next != null; temp = temp.next) {

			}
			int data = temp.next.data;
			temp.next = null;
			return data;
		}
	}

	public int deleteAtSpecificPosition(int position) {
		if (head == null) {
			throw new NoSuchElementException("List is empty.");
		}else if(head.next==null)
		{
			return deleteAtEnd();
		}
			else {
			Node temp;
			int counter;
			for (temp = head, counter = 1; counter < position - 1; temp = temp.next, counter++) {

			}
			int data = temp.next.data;
			System.out.println("Data" + data);
			if (temp == head) {
				head = head.next;
			} else if (temp.next.next == null) {
				temp.next = null;
			} else {
				temp.next = temp.next.next;
				temp.next.prev=temp;
			}
			return data;
		}
	}

	public void display() {
		Node temp;
		System.out.print("Linked List : ");
		System.out.print("null <==>");
		for (temp = head; temp != null; temp = temp.next) {
			System.out.print(temp.data + "<==>");
		}
		System.out.println("null");
	}

	public int count() {
		Node temp;
		int cnt = 0;
		for (temp = head; temp != null; temp = temp.next) {
			++cnt;
		}
		return cnt;
	}

	public boolean isEmpty() {
		return head == null;
	}

}
