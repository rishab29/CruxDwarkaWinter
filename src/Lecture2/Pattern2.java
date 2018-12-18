package Lecture2;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;
//		int cols = 5;
//		int nsts = 1;
//		
//		int nst = 1;
//		int row = 1;
//		while (row <= rows) {
//			nst = 1;
//			while(nst<=nsts) {
//				System.out.print("* ");
//				nst++;
//			}
//			System.out.println();
//			nsts++;
//			row++;
//		}
		
		
		int row=1;
		while(row<=rows) {
			int col=1;
			while(col<=row) {
				System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
		}
	}

}
