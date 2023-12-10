package day1;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the capacity of the array");

			int[] array = new int[sc.nextInt()];

			System.out.println("Enter the elements");
			for (int i = 0; i < array.length; i++) {
				array[i] = sc.nextInt();
			}

			boolean done = false;
			while (!done) {
				System.out.println("1. Display the array");
				System.out.println("2. Reverse the array");
				System.out.println("3. Replace the nth element from the array and print");
				System.out.println("4. Find the addition of all elements of the array");
				System.out.println("5. Find the maximum number from the array");
				System.out.println("6. Print the average of all the elements from the array.");
				System.out.println("7. Display the even and odd number from the array separately.");
				System.out.println("0. EXIT");
				System.out.println("Enter the choice");
				switch (sc.nextInt()) {
				case 1:// display
					display(array);
					break;
				case 2:
					reverse(array);
					break;
				case 3:
					System.out.println("Enter the position and elements wants to replace");
					replace(array, sc.nextInt(), sc.nextInt());
					break;
				case 4:
					System.out.println("Addition of all elements in array " + addition(array));
					break;
				case 5:
					System.out.println("Maximum  element in array " + maximum(array));
					break;
				case 6:
					System.out.println("Average of all elements in array is " + average(array));
					break;
				case 7:
					System.out.println("Display the even and odd numbers from array");
					oddEven(array);
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

	private static void oddEven(int[] array) {
		System.out.println("Even Elements in array");
		for (int n : array) {
			if (n % 2 == 0)
				System.out.println(n + " ");
		}
		System.out.println("Odd Elements in array");
		for (int n : array) {
			if (n % 2 != 0)
				System.out.println(n + " ");
		}
	}

	private static int average(int[] array) {
		int sum = addition(array);
		return sum / array.length;
	}

	private static int maximum(int[] array) {

		int max = Integer.MIN_VALUE;
		for (int n : array) {
			if (n > max) {
				max = n;
			}
		}
		return max;
	}

	private static int addition(int[] array) {
		int sum = 0;
		for (int n : array) {
			sum += n;
		}
		return sum;
	}

	private static void replace(int[] array, int position, int element) {
		if (position < 1 || position > array.length) {
			System.out.println("Entered wrong Position!!!");
			return;
		}
		array[position - 1] = element;
		display(array);

	}

	public static void display(int[] array) {
		System.out.print("Array Elements are: ");
		for (int n : array) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

	private static void reverse(int[] array) {
		System.out.print("Array elements are: ");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
