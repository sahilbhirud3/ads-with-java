package assign9;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("BST Created");

			BST bst = new BST();

			boolean done = false;
			while (!done) {
				try {

//			a. Show the contents of doubly linked list
//					b. Insert the data in the doubly linked list
//					c. Check how many elements are there in the doubly linked list.
//					d. Check to see if doubly linked list is empty.
					System.out.println("1. Show the contents ");
					System.out.println("2. Insert the data at end in the doubly linked list");
				
					System.out.println("0. EXIT");
					System.out.println("Enter the choice");

					switch (sc.nextInt()) {
					case 1://preorder
						bst.display();
						break;
					case 2:
						System.out.println("Enter the element Insert the data in the Tree");
						bst.insert(sc.nextInt());
						System.out.println("Inserted");
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
