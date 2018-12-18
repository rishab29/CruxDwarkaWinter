package Lecture2;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;
		int cols = 5;

		int row = 1;
		while (row <= rows) {
			int col = 1;
			while (col <= cols) {
				System.out.print("*");
				col++;
			}
			System.out.println();
			cols--;
			row++;
		}
	}

}
