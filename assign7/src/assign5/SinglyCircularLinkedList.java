package assign5;

import java.util.NoSuchElementException;

public class SinglyCircularLinkedList {
	private static class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private Node head;
	private Node tail;

	public SinglyCircularLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void addAtBegin(int element) {
		Node newNode = new Node(element);

		if (head == null) {
			head = newNode;
			tail = newNode;
			newNode.next = head; 
		} else {
			newNode.next = head;
			head = newNode;
			tail.next = head;
		}
	}

	public void addAtEnd(int element) {
		Node newNode = new Node(element);
		if (head == null) {
			head = newNode;
			tail = newNode;
			newNode.next = head; 
		} else {
			newNode.next = head;
			tail.next = newNode;
			tail = newNode; 
		}
	}

	public void addAtSpecificPosition(int element, int position) {
		Node newNode = new Node(element);
		if (head == null) {
			head = newNode;
			tail = newNode;
			newNode.next = head; 
		} else {
			if (position == 0) {
				newNode.next = head;
				head = newNode;
				tail.next = head; 
			} else {
				Node temp = head;
				int counter = 0;
				while (temp != tail && counter < position - 1) {
					temp = temp.next;
					counter++;
				}
				if (counter != position - 1) {
					throw new NoSuchElementException("Position is out of bounds.");
				}
				newNode.next = temp.next;
				temp.next = newNode;
				if (temp == tail) {
					tail = newNode; 
				}
			}
		}
	}

	public int deleteAtBegin() {
		if (head == null) {
			throw new NoSuchElementException("List is empty.");
		} else {
			int data = head.data;
			head = head.next;
			tail.next = head; 
			return data;
		}
	}

	public int deleteAtEnd() {
		if (head == null) {
			throw new NoSuchElementException("List is empty.");
		} else if (head.next == head) {
			int data = head.data;
			head = null;
			tail = null;
			return data;
		} else {
			Node temp;
			for (temp = head; temp.next != tail; temp = temp.next) {
			}
			int data = temp.next.data;
			temp.next = head;
			tail = temp;
			return data;
		}
	}

	public int deleteAtSpecificPosition(int position) {
		if (head == null) {
			throw new NoSuchElementException("List is empty.");
		} else if (head.next == head) {
			return deleteAtEnd();
		} else {
			Node temp;
			int counter;
			for (temp = head, counter = 1; counter < position - 1; temp = temp.next, counter++) {
			}
			int data = temp.next.data;
			if (temp == head) {
				head = head.next;
				tail.next = head; 
			} else if (temp.next == tail) {
				temp.next = head;
				tail = temp; 
			} else {
				temp.next = temp.next.next;
			}
			return data;
		}
	}

	public void display() {
		if (head == null) {
			System.out.println("Linked List is empty.");
			return;
		}

		Node temp = head;
		System.out.print("Linked List : ");
		do {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		} while (temp != head);
		System.out.println("head");
	}

	public int count() {
		if (head == null) {
			return 0;
		}

		int cnt = 0;
		Node temp = head;
		do {
			cnt++;
			temp = temp.next;
		} while (temp != head);
		return cnt;
	}

	public boolean isEmpty() {
		return head == null;
	}
}
