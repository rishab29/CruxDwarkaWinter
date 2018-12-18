package Lecture2;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int row=1;
       
       int n=4;
       while(row<=n) {
    	   //Part 1
    	   int nsp=n-row;
    	   int col=1;
    	   while(col<=nsp) {
    		   System.out.print(" ");
    		   col++;
    	   }
    	   
    	   col=1;
    	   while(col<=row) {
    		   System.out.print("1");
    		   col++;
    	   }
    	   System.out.println();
    	   row++;
       }
	}

}
