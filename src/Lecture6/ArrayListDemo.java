package Lecture6;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 50, 40, 30, 20, 10 };
		ArrayList<Integer> list = new ArrayList<>();

		System.out.println(list.size());

		list.add(10);
		System.out.println(list);
		System.out.println(list.size());
		list.toString();

		list.add(20);
		System.out.println(list);
		System.out.println(list.size());

		list.add(30);
		System.out.println(list);
		System.out.println(list.size());

		list.add(40);
		System.out.println(list);
		System.out.println(list.size());

		list.add(50);
		System.out.println(list);
		System.out.println(list.size());

		System.out.println(list.size());
		System.out.println(list.get(2));

		list.add(2, 25);
		System.out.println(list);
		System.out.println(list.size());

		list.set(2, 250);
		System.out.println(list);
		System.out.println(list.size());

		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
