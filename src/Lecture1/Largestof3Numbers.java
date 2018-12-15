package Lecture1;

public class Largestof3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 15;
		int b = 15;
		int c = 15;
		/*if (a > b && a > c) {
			System.out.println(a);
		} else {
			if (b > a && b > c) {
				System.out.println(b);
			} else {
				System.out.println(c);
			}
		}*/
		
		/*if(a>=b&&a>=c) {
			System.out.println(a);
		}else if(b>=a&&b>=c) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}*/
		
		if(a>=b&&a>=c) {
			System.out.println(a);
		}if(b>=a&&b>=c) {
			System.out.println(b);
		}if(c>=b&&c>=a) {
			System.out.println(c);
		}
	
		System.out.println("Hello World");

	}

}
