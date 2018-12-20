package Lecture3;

public class Pattern3 {

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
			int value=1;
			while (col <= row) {
				System.out.print(value);
				value++;
				col++;
			}

			col = 1;
			value=value-2;
			while (col < row) {
				System.out.print(value);
				value--;
				col++;
			}

			System.out.println();

			row++;
		}
	}

}
