package Lecture9;

import java.util.ArrayList;

public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
//		System.out.println(countMazePath(n, n, 0, 0));
//		System.out.println(getMazePath(n, n, 0, 0));
		// printMazePath(n, n, 0, 0, "");
//
//		System.out.println(countMazePathWD(n, n, 0, 0));
//		System.out.println(getMazePathWD(n, n, 0, 0));
//		printMazePathWD(n, n, 0, 0, "");
//
//		printLexico(1000, 0);

//		System.out.println(TOH(n, "src", "dest", "helper"));

		boolean[][] board = new boolean[n][n];
		System.out.println(countNqueens(board, 0));

	}

	public static int countMazePath(int er, int ec, int cr, int cc) {
		if (cr == er && cc == ec) {
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}

		int mycount = 0;
		int rcount = countMazePath(er, ec, cr, cc + 1);
		int dcount = countMazePath(er, ec, cr + 1, cc);
		mycount = rcount + dcount;
		return mycount;

	}

	public static ArrayList<String> getMazePath(int er, int ec, int cr, int cc) {
		if (er == cr && ec == cc) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		if (cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<>();
			// br.add("");
			return br;
		}

		ArrayList<String> myResult = new ArrayList<>();
		ArrayList<String> hResult = getMazePath(er, ec, cr, cc + 1);
		ArrayList<String> vResult = getMazePath(er, ec, cr + 1, cc);
		for (int i = 0; i < hResult.size(); i++) {
			myResult.add("H" + hResult.get(i));
		}
		for (int i = 0; i < vResult.size(); i++) {
			myResult.add("V" + vResult.get(i));
		}
		return myResult;
	}

	public static void printMazePath(int er, int ec, int cr, int cc, String res) {

		if (er == cr && ec == cc) {
			System.out.println(res);
			return;
		}

		if (cr > er || cc > ec) {
			return;
		}
		printMazePath(er, ec, cr, cc + 1, res + "H");
		printMazePath(er, ec, cr + 1, cc, res + "V");
	}

	public static int countMazePathWD(int er, int ec, int cr, int cc) {
		if (cr == er && cc == ec) {
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}

		int mycount = 0;
		int rcount = countMazePathWD(er, ec, cr, cc + 1);
		int dcount = countMazePathWD(er, ec, cr + 1, cc + 1);
		int vcount = countMazePathWD(er, ec, cr + 1, cc);
		mycount = rcount + dcount + vcount;
		return mycount;

	}

	public static ArrayList<String> getMazePathWD(int er, int ec, int cr, int cc) {
		if (er == cr && ec == cc) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		if (cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<>();
			// br.add("");
			return br;
		}

		ArrayList<String> myResult = new ArrayList<>();
		ArrayList<String> hResult = getMazePathWD(er, ec, cr, cc + 1);
		ArrayList<String> vResult = getMazePathWD(er, ec, cr + 1, cc);
		ArrayList<String> dResult = getMazePathWD(er, ec, cr + 1, cc + 1);
		for (int i = 0; i < hResult.size(); i++) {
			myResult.add("H" + hResult.get(i));
		}
		for (int i = 0; i < vResult.size(); i++) {
			myResult.add("V" + vResult.get(i));
		}
		for (int i = 0; i < dResult.size(); i++) {
			myResult.add("D" + dResult.get(i));
		}
		return myResult;
	}

	public static void printMazePathWD(int er, int ec, int cr, int cc, String res) {

		if (er == cr && ec == cc) {
			System.out.println(res);
			return;
		}

		if (cr > er || cc > ec) {
			return;
		}
		printMazePathWD(er, ec, cr, cc + 1, res + "H");
		printMazePathWD(er, ec, cr + 1, cc, res + "V");
		printMazePathWD(er, ec, cr + 1, cc + 1, res + "D");
	}

	public static void printLexico(int end, int curr) {
		if (curr > end) {
			return;
		}

		System.out.println(curr);
		if (curr == 0) {
			for (int i = 1; i < 10; i++) {
				printLexico(end, curr * 10 + i);
			}
		} else {
			for (int i = 0; i < 10; i++) {
				printLexico(end, curr * 10 + i);
			}
		}
	}

	public static int TOH(int n, String src, String dest, String helper) {
		if (n == 0) {
			return 0;
		}
		int count = 0;
		count = count + TOH(n - 1, src, helper, dest);
		System.out.println("Move " + n + "th disc from " + src + " to " + dest);
		count = count + 1;
		count = count + TOH(n - 1, helper, dest, src);

		return count;

	}

	public static int countNqueens(boolean[][] board, int row) {
		if (row == board.length) {
			return 1;
		}
		int count = 0;
		for (int col = 0; col < board[row].length; col++) {
			if (isItSafe(board, row, col)) {
				board[row][col] = true;
				count = count + countNqueens(board, row + 1);
				board[row][col] = false;
			}
		}

		return count;
	}

	public static boolean isItSafe(boolean[][] board, int row, int col) {

		for (int i = row; i >= 0; i--) {
			if (board[i][col]) {
				return false;
			}
		}

		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j]) {
				return false;
			}
		}

		for (int i = row, j = col; i >= 0 && j < board[row].length; i--, j++) {
			if (board[i][j]) {
				return false;
			}
		}
		
		return true;
	}

}
