package assign15;
import java.util.Scanner;

public class MergeSort {

	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] array=null;

		System.out.println("Enter the size of the array");
		array = new int[sc.nextInt()];
		accept(array);
		display(array);
		mergeSort(array);
		System.out.println("Sorted Array : ");
		display(array);
		sc.close();

	}

	private static void mergeSort(int [] array) {
	
		if(array.length<=1)
		{
			return;
		}
		int mid=array.length/2;
		int [] left=new int[mid];
		int [] right=new int[array.length-mid];
		System.arraycopy(array, 0, left, 0, mid);
		System.arraycopy(array, mid, right, 0, array.length- mid);
		mergeSort(left);
		mergeSort(right);
		merge(array,left,right);
		
	

	}

	private static void merge(int[] array, int[] left, int[] right) {
		int i = 0;
		int j = 0;
		int k = 0;
		while(i<left.length && j<right.length)
		{
			if(left[i] < right[j])
			{
				array[k] = left[i];
				i++;
			}
			else
			{
				array[k] = right[j];
				j++;
			}
			k++;
		}
		while(i<left.length)
		{
			array[k] = left[i];
			i++;
			k++;
		}
		while(j<right.length)
		{
			array[k] = right[j];
			j++;
			k++;
		}
		
	}

	

	private static void accept(int [] array) {
		System.out.println("Enter the elements");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

	}

	private static void display(int [] array) {                                                                                                                                                                                                                                                                                                                                                   
		System.out.println("Array Elements");
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
