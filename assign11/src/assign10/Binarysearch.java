package assign10;

import java.util.Arrays;
import java.util.Scanner;

public class Binarysearch {

	private static int[] array;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the size of the array");
		array = new int[sc.nextInt()];
		accept();
		Arrays.sort(array);
		System.out.println("Sorted Array");
		display();
		System.out.println("Enter the element want to search");
		int element=sc.nextInt();
		int result = binarySearch(element);
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

	private static int binarySearch(int element) {
		int low=0;
		int high=array.length;
		int mid;
		while(low<=high)
		{
			mid=low+((high-low)/2);
			if(array[mid]==element)
			{
				return mid;
			}
			else if(element<array[mid])
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		}
		
		
		return -1;
	}

}
