package Lecture2;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;
		int cols = 5;
		int nsts = 5;

		int row = 1;
		while (row <= rows) {
			int nst = 1;
			while (nst <= nsts) {
				System.out.print("*");
				nst++;
			}
			System.out.println();
			row++;
		}
	}

}
