package Lecture3;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int nsp = 2 * n - 3;
		int nst = 1;
		while (row <= n) {
			int col = 1;
			while (col <= nst) {
				System.out.print("*");
				col++;
			}

			if (row == n) {
				System.out.print("*");
			} else {
				col = 1;
				while (col <= nsp) {
					System.out.print(" ");
					col++;
				}
			}

			col = 1;
			while (col <= nst) {
				System.out.print("*");
				col++;
			}
			if (row < n - 1) {
				nst++;
				nsp = nsp - 2;
			}
			System.out.println();
			row++;
		}

	}

}
