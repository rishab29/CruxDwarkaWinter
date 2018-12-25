package Lecture4;

public class FunWithQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dec = 32;
		int bin = DecToBin(dec);
		System.out.println(bin);// 1000000
		System.out.println(BinToDec(bin));// 32

		System.out.println(AnyToDec(37, 8));// 31
		System.out.println(DecToAny(31, 8));// 37

		System.out.println(AnyToAny(37, 8, 2));// 11111

		System.out.println(inverse(3142));

		System.out.println(log(1024, 2));
	}

	public static int DecToBin(int dec) {
		int tenpowers = 1;
		int bin = 0;
		while (dec != 0) {
			int rem = dec % 2;
			bin = bin + rem * tenpowers;
			dec = dec / 2;
			tenpowers = tenpowers * 10;
		}
		return bin;
	}

	public static int BinToDec(int bin) {
		int twopowers = 1;
		int dec = 0;
		while (bin != 0) {
			int rem = bin % 10;
			dec = dec + rem * twopowers;
			bin = bin / 10;
			twopowers = twopowers * 2;
		}
		return dec;
	}

	public static int AnyToDec(int num, int sb) {
		int sbpowers = 1;
		int dec = 0;
		while (num != 0) {
			int rem = num % 10;
			dec = dec + rem * sbpowers;
			num = num / 10;
			sbpowers = sbpowers * sb;
		}
		return dec;
	}

	public static int DecToAny(int dec, int db) {
		int tenpowers = 1;
		int num = 0;
		while (dec != 0) {
			int rem = dec % db;
			num = num + rem * tenpowers;
			dec = dec / db;
			tenpowers = tenpowers * 10;
		}
		return num;
	}

	public static int AnyToAny(int num, int sb, int db) {
		int dec = AnyToDec(num, sb);
		int ans = DecToAny(dec, db);
		return ans;
	}

	public static int inverse(int num) {
		int inv = 0;
		int pow = 1;
		int counter = 1;
		while (num != 0) {
			int rem = num % 10;
			pow = 1;
			while (rem != 1) {
				pow = pow * 10;
				rem--;
			}
			inv = inv + pow * counter;
			counter++;
			num = num / 10;
		}
		return inv;
	}

	public static int log(int x, int n) {

		int counter = 0;
		while (x != 1) {

			x = x / n;
			counter++;
		}
		return counter;
	}

}
