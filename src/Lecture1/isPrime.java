package Lecture1;

import java.util.Scanner;

public class isPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int divisor = 2; divisor < n; divisor++) {
			if (n % divisor == 0) {
				System.out.println("Not Prime");
				return;
			}
		}
		System.out.println("Prime");
	}

}
