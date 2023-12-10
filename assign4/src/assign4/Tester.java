package assign4;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the capacity of the CircularQueue");

			CircularQueue queue = new CircularQueue(sc.nextInt());

			boolean done = false;
			while (!done) {

//				Show the contents of circular queue
//				b. Enqueue the data in the circular queue
//				c. Access the data from the circular queue
//				d. Check how many elements are there in the circular queue.
//				e. Check to see if the circular queue is full?
//				f. Check to see if circular queue is empty.
				System.out.println("1. Show the queue");
				System.out.println("2. Enqueue the data in the circular queue");
				System.out.println("3. Access the data from the circular queue");
				System.out.println("4. Check how many elements are there in the circular queue.");
				System.out.println("5. Check to see if the circular queue is full?");
				System.out.println("6. Check to see if circular queue is empty.");
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
