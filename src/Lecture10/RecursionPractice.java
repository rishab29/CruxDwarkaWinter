package Lecture10;

import java.util.ArrayList;
import java.util.Arrays;

public class RecursionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// char[][] matrix = { { 'a', 'a', 'a', 'b' }, { 'b', 'a', 'a', 'a' }, {
		// 'a', 'b', 'b', 'a' } };
		// printpath(matrix, "", 0, 0);
		// System.out.println(countpath(matrix, "", 0, 0));

		// int[][] matrix1 = { { 1, 1, 1, 2 }, { 2, 3, 1, 2 }, { 3, 2, 5, 4 }, {
		// 0, 0, 0, 1 } };
		// System.out.println(calculatecost(matrix1, 0, 0));

		// int[] arr = { 4, 6, 2, 8 };
		// Arrays.sort(arr);
		// findsum(arr, "( ", 8, 0, 0);

//		ArrayList<Integer> arr = new ArrayList<>();
//		arr.add(8);
//		arr.add(15);
//		arr.add(5);
//		arr.add(7);
//
//		System.out.println(game(arr, 0, true));
		
		
		System.out.println("60".compareTo("384"));
	}

	public static void printpath(char[][] matrix, String result, int row, int col) {

		if (row >= matrix.length || col >= matrix[0].length) {
			return;
		}

		if (row == matrix.length - 1 && col == matrix[0].length - 1) {
			result += matrix[row][col];
			if (ispalindrom(result)) {
				System.out.println(result);
			}
			return;
		}

		printpath(matrix, result + matrix[row][col], row + 1, col);
		printpath(matrix, result + matrix[row][col], row, col + 1);

	}

	public static int countpath(char[][] matrix, String result, int row, int col) {

		if (row >= matrix.length || col >= matrix[0].length) {
			return 0;
		}

		if (row == matrix.length - 1 && col == matrix[0].length - 1) {
			result += matrix[row][col];
			if (ispalindrom(result)) {
				return 1;

			}
			return 0;
		}

		return countpath(matrix, result + matrix[row][col], row + 1, col)
				+ countpath(matrix, result + matrix[row][col], row, col + 1);

	}

	public static boolean ispalindrom(String str) {
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	public static int calculatecost(int[][] matrix, int row, int col) {
		if (row >= matrix.length || col >= matrix[0].length) {
			return Integer.MAX_VALUE;
		}

		if (row == matrix.length - 1 && col == matrix[0].length - 1) {
			return matrix[row][col];
		}

		int a = calculatecost(matrix, row + 1, col);
		int b = calculatecost(matrix, row, col + 1);
		return Math.min(a, b) + matrix[row][col];
	}

	public static void findsum(int[] arr, String result, int sum, int currentsum, int index) {

		if (index == arr.length || currentsum > sum) {
			return;
		}

		if (currentsum == sum) {
			System.out.println(result + ")");
			return;
		}

		findsum(arr, result + arr[index] + " ", sum, currentsum + arr[index], index);
		findsum(arr, result, sum, currentsum, index + 1);

	}

	public static int game(ArrayList<Integer> arr, int sum, boolean turn) {

		if (arr.size() == 1) {
			if (turn) {
				return sum + arr.get(0);
			} else {
				return sum;
			}
		}
		
		if(turn){
			int temp=arr.remove(0);
			int sum1=game(arr, sum+temp, false);
			arr.add(0, temp);
			temp=arr.remove(arr.size()-1);
			int sum2=game(arr, sum+temp, false);
			arr.add(temp);
			return Math.max(sum1, sum2);
			
		}else{
			int temp=arr.remove(0);
			int sum1=game(arr, sum, true);
			arr.add(0, temp);
			temp=arr.remove(arr.size()-1);
			int sum2=game(arr, sum, true);
			arr.add(temp);
			return Math.min(sum1, sum2);
		}
	}

	
	
}
