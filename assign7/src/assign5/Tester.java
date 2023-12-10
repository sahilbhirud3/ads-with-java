package assign5;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("LinkedList Created");

			SinglyCircularLinkedList linkedList = new SinglyCircularLinkedList();

			boolean done = false;
			while (!done) {
				try {

//				a. Show the contents of linked list
//				b. Insert the data in the linked list
//				c. Check how many elements are there in the linked list.
//				d. Check to see if linked list is empty.
					System.out.println("1. Show the contents of linked list");
					System.out.println("2. Insert the data at end in the linked list");
					System.out.println("3. Delete the data from end in the linked list");
					System.out.println("4. Check how many elements are there in the linked list");
					System.out.println("5. Check to see if linked list is empty..");
					System.out.println("0. EXIT");
					System.out.println("Enter the choice");

					switch (sc.nextInt()) {
					case 1:// display
						linkedList.display();
						break;
					case 2:
						System.out.println("Enter the element Insert the data in the linked list");
						linkedList.addAtEnd(sc.nextInt());
						break;
					case 3:
						System.out.println("Remove: " + linkedList.deleteAtEnd());
						break;
					case 4:

						System.out.println("Count of elements in linkedList : " + linkedList.count());
						break;
					case 5:
						if (linkedList.isEmpty())
							System.out.println("linkedList is Empty");
						else
							System.out.println("linkedList is Not Empty");

						break;

					case 0:
						done = true;
						System.out.println("Bye");
						break;
					default:
						System.out.println("Enter Valid Choice");

					}
				} catch (Exception e) {
					System.out.println(e);
				}
			}

		}

	}

}
