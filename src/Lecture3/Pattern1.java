package Lecture3;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int rows = n;
		int nst = n;
		int nsp = 0;
		int row = 1;
		while (row <= rows) {
			int col = 1;
			while (col <= nsp) {
				System.out.print(" ");
				col++;
			}

			col = 1;
			while (col <= nst) {
				System.out.print("*");
				col++;
			}
			nsp = nsp + 2;
			nst--;
			row++;
			System.out.println();
		}

	}

}
