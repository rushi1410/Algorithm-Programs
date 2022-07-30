package com.bridgelabz;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String args[])
	{
		BubbleSort bubbleSort = new BubbleSort();

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the no. of Integers: ");
		int n = input.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the array elements: ");
			arr[i] = input.nextInt();
		}
		input.close();

		bubbleSort.bubbleSort(arr);

		System.out.print("Sorted list: ");
		bubbleSort.printArray(arr);
	}

	void bubbleSort(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n-1; i++)
			for (int j = 0; j < n-i-1; j++)
				if (arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
	}

	/* Prints the array */
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}    

}
