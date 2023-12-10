package assign3;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the capacity of the Queue");

			Queue queue = new Queue(sc.nextInt());

			boolean done = false;
			while (!done) {

//				a. Show the queue
//				b. Store the data in the queue
//				c. Access the data from the queue
//				d. Check how many elements are there in the queue.
//				e. Check to see if the queue is full?
//				f. Check to see if queue is empty.
				System.out.println("1. Show the queue");
				System.out.println("2. Store the data in the queue");
				System.out.println("3. Access the data from the queue");
				System.out.println("4. Check how many elements are there on the queue.");
				System.out.println("5. Check to see if the queue is full?");
				System.out.println("6. Check to see if queue is empty.");
				System.out.println("0. EXIT");
				System.out.println("Enter the choice");

				switch (sc.nextInt()) {
				case 1:// display
					queue.display();
					break;
				case 2:
					System.out.println("Enter the element for add operation");
					queue.add(sc.nextInt());
					break;
				case 3:
					System.out.println("Remove: " + queue.remove());
					break;
				case 4:

					System.out.println("Count of elements in queue : " + queue.count());
					break;
				case 5:
					if (queue.isFull())
						System.out.println("queue is Full");
					else
						System.out.println("queue is Not Full");

					break;

				case 6:
					if (queue.isEmpty())
						System.out.println("queue is Empty");
					else
						System.out.println("queue is Not Empty");
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
