package assign10;

import java.util.Scanner;

public class SelectionSort {

	private static int[] array;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the size of the array");
		array = new int[sc.nextInt()];
		accept();
		display();
		selectionSort();
		System.out.println("Sorted Array : ");
		display();
		sc.close();

	}

	private static void selectionSort() {
		int min;
		for (int i = 0; i < array.length; i++) {
			min=i;
			for(int j=i+1;j<array.length;j++)
			{
				if(array[min]>array[j])
				{
					min=j;
				}
			}
			int temp=array[i];
			array[i]=array[min];
			array[min]=temp;
		}

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

}
