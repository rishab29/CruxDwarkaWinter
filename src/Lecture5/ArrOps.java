package Lecture5;

import java.util.Scanner;

public class ArrOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = takeInput();
//		display(arr);
//		// int[] arr = { 10, 30, 50, 70, 20 };
		// System.out.println(max(arr));
//		reverse(arr);
//		display(arr);
		// System.out.println(linearSearch(arr, 50));

//		int[] arr = { 10, 20, 30, 40, 50 };
//		System.out.println(binarySearch(arr, 100));

		int[] arr = { 50, 40, 30, 20, 10 };
		// bubbleSort(arr);
		//selectionSort(arr);
		insertionSort(arr);
		display(arr);

	}

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		//System.out.println("Enter the length of array");
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
		//	System.out.println("Enter the value at " + i + " index");
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static int max(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void reverse(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i <= j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

	public static int linearSearch(int[] arr, int data) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == data) {
				return i;
			}
		}

		return -1;
	}

	public static int binarySearch(int[] arr, int data) {
		int start = 0, end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == data) {
				return mid;
			} else if (arr[mid] > data) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}

		return -1;
	}

	public static void bubbleSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min_index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min_index]) {
					min_index = j;
				}
			}

			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}
	}

	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		}
	}
}
