package corejava.questions.day2;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter array element at " + i + " : ");
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr); // Sorting of array
		System.out.println(Arrays.toString(arr));
		int min = arr[0];
		int max = arr[n - 1];
		System.out.println(min+" "+max);
		int c = 0;
		//int missarr[] = new int[5];
		for (int i = min; i<arr[n-1]; i++) {
			System.out.println("i is "+i);
			if (i == arr[c]) {
				
				continue;
			}
			else {
				System.out.println("missing element is " + i);
				c++;
				
			}

		}
	}

}