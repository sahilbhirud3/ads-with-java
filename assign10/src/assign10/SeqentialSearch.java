package assign10;

import java.util.Scanner;

public class SeqentialSearch {

	private static int[] array;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the size of the array");
		array = new int[sc.nextInt()];
		accept();
		display();
		System.out.println("Enter the element want to search");
		int result = sequentialSearch(sc.nextInt());
		if (result == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element fount at position " + result);
		}
		sc.close();

	}

	private static void accept() {
		System.out.println("Enter the elements");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

	}

	private static void display() {
		System.out.println("Array Elements");
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

	private static int sequentialSearch(int element) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element)
				return i;
		}
		return -1;
	}

}
