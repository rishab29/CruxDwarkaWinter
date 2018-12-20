package Lecture3;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;

		int row = 1;
		while (row <= n) {
			int col = 1;
			int nsp = n - row;
			while (col <= nsp) {
				System.out.print(" ");
				col++;
			}

			col = 1;
			while (col <= row) {
				if (col == 1) {
					System.out.print(row);
				} else {
					System.out.print("0");
				}
				col++;
			}

			col = 1;

			while (col < row) {
				if (col == row - 1) {
					System.out.print(row);
				} else {
					System.out.print("0");
				}
				col++;
			}

			System.out.println();

			row++;
		}
	}

}
