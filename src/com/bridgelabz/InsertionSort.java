package com.bridgelabz;

import java.util.Scanner;

public class InsertionSort {
	public static void main(String args[]){		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n = input.nextInt();

		String[] strings = new String[n];
		int i = 0;
		while (i < n){
			System.out.print("Element " + i + ":");
			strings[i] = input.next();
			i++;
		}

		InsertionSort ob = new InsertionSort();	
		ob.sort(strings);

		printArray(strings);
		input.close();
	}

	/**
	 * Function to sort array using insertion sort
	 * @param arr[] - array of strings
	 * */
	void sort(String arr[]){
		int n = arr.length;
		for (int i=1; i<n; ++i){
			String key = arr[i];
			int j = i-1;

			/* Move elements of arr[0..i-1], that are
			greater than key, to one position ahead
			of their current position */
			while (j>=0 && arr[j].compareTo(key) > 0){
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}

	/* A utility function to print array of size n*/
	static void printArray(String arr[]){
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

}
