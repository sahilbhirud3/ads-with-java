package assign10;

import java.util.Scanner;

public class BubbleSort {

	private static int[] array;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the size of the array");
		array = new int[sc.nextInt()];
		accept();
		display();
		bubbleSort();
		System.out.println("Sorted Array : ");
		display();
		sc.close();

	}

	private static void bubbleSort() {
		
		for (int i = 0; i < array.length-1; i++) {
			System.out.print("pass "+(i+1));
			for(int j=0;j<array.length-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
			display();
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
