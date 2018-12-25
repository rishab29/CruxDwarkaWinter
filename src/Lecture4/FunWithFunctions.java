package Lecture4;

public class FunWithFunctions {

	public static int global = 10000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Part 1
		// System.out.println("Hello");

		// Part 2
//		HelloFun();
//		HelloFun();

		// Part 3
//		HelloGun();
//		HelloFun();

		// Part 4
		int p = 1000;
		int r = 10;
		int t = 1;
//		int sinterest = si(p, r, t);
//		System.out.println(sinterest);
	//	System.out.println(si(p, r, t));

		// Part 5
//		int a = 10;
//		int b = 30;
//		if (a > 20) {
//			System.out.println(a);
//		} else {
//			b = 40;
//			System.out.println(b);
//		}
//		b = 30;
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(global);
		
		//Part 6
		int a=10,b=20;
		System.out.print(a+" "+b);
		swap(a, b);
		System.out.print(a+" "+b);
	}

	public static void HelloFun() {
		System.out.println("HelloFun");
		HelloGun();
	}

	public static void HelloGun() {
		System.out.println("HelloGun");
		System.out.println(global);
	}

	public static int si(int p, int r, int t) {
		int si = (p * r * t) / 100;
		System.out.println(global);
		return si;
	}
	
	public static void swap (int a,int b) {
		System.out.print(a+" "+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.print(a+" "+b);
	}

}
