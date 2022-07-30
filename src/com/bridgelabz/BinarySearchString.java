package com.bridgelabz;

import java.util.Scanner;

public class BinarySearchString {
	public static void main(String []args){
		String[] arr = { "alpha", "blue", "charlie", "delta", "echo"};
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String x = input.nextLine();
		int result = binarySearch(arr, x);

		if (result == -1)
			System.out.println("Word not present");
		else
			System.out.println("Word found at " + "index " + result);

		input.close();
	}
	/* 
	     Returns index of x if it is present in arr[],
		 else return -1
	 */
	static int binarySearch(String[] arr, String x){
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;

			int res = x.compareTo(arr[m]);

			/*
	             Check if x is present at mid
			 */ 
			if (res == 0)
				return m;

			/* 
	            If x greater, ignore left half
			 */
			if (res > 0)
				l = m + 1;

			/* 
	            If x is smaller, ignore right half
			 */
			else
				r = m - 1;
		}

		return -1;
	}

}
