package Lecture2;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int rows=4;
        
        int row=1;
        int value=1;
        while(row<=rows) {
        	int col=1;
        	while(col<=row) {
        		System.out.print(value);
        		value++;
        		col++;
        	}
        	System.out.println();
        	row++;
        }
	}

}
