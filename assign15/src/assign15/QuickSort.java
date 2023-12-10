package assign15;
import java.util.Scanner;

public class QuickSort {

	private static int[] array;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the size of the array");
		array = new int[sc.nextInt()];
		accept();
		display();
		quickSort(0, array.length - 1);
		System.out.println("Sorted Array : ");
		display();
		sc.close();

	}

	private static void quickSort(int low, int high) {
		if (low < high) {
			int pivot = partition(low, high);
			quickSort(low, pivot-1);
			quickSort(pivot+1,high);
		}

	}

	private static int partition(int low, int high) {
		int pivot = array[high];
		int i = low ;
		for(int j=low;j<high;j++) {
			if(array[j]<pivot)
			{
				
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				i++;
			}
		}
		int temp=array[i];
		array[i]=array[high];
		array[high]=temp;
		return i;

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
