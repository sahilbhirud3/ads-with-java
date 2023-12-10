package day2;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the capacity of the Stack");

			Stack stack = new Stack(sc.nextInt());

			boolean done = false;
			while (!done) {

				System.out.println("1. Display the stack");
				System.out.println("2. Push the data on the stack");
				System.out.println("3. Pop the data from the stack");
				System.out.println("4. Check how many elements are there on the stack.");
				System.out.println("5. Check to see if the stack is full?");
				System.out.println("6. Check to see if stack is empty.");
				System.out.println("0. EXIT");
				System.out.println("Enter the choice");
				switch (sc.nextInt()) {
				case 1:// display
					stack.display();
					break;
				case 2:
					System.out.println("Enter the element for push operation");
					stack.push(sc.nextInt());
					break;
				case 3:
					System.out.println("Poped: " + stack.pop());
					break;
				case 4:

					System.out.println("Count of elements in stack : " + stack.count());
					break;
				case 5:
					if (stack.isFull())
						System.out.println("Stack is Full");
					else
						System.out.println("Stack is Not Full");

					break;

				case 6:
					if (stack.isEmpty())
						System.out.println("Stack is Empty");
					else
						System.out.println("Stack is Not Empty");
					break;

				case 0:
					done = true;
					System.out.println("Bye");
					break;
				default:
					System.out.println("Enter Valid Choice");

				}
			}

		}

	}

}
