package corejava.questions.day2;

/*Write a method which accepts an array of integers as a parameter and 
 * returns the second highest element in the given array. 
 * If there are multiple such element, it can be printed just once.
 */

import java.util.Arrays;
import java.util.Scanner;

public class SecondHigest extends SortingTechniques {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of arrays elements : ");
		int n = sc.nextInt();
		int arr[] = ArrayInput.arrayInput(n); // Array input from user
		System.out.println("Sorted array is : " + Arrays.toString(bubbleSort(arr)));
		// Arrays.sort(arr); //its is predefined function in java to sort array using
		// QuickSort
		int sort[] = new int[1];
		sort[0] = arr[n - 2];
		System.out.println("Second biggest in array is : " + Arrays.toString(sort));
		sc.close();
	}

	public static int[] bubbleSort(int[] arr) {
		int n = arr.length;
		int temp;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

}
