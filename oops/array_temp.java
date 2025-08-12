package oops;

import java.util.Scanner;

public class array_temp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = 7;
		int[] a = new int[size];
		System.out.println("enter the temp: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		temp(a);
		scan.close();
	}

	public static void temp(int[] a) {
		int key = 5;
		for (int i = 1; i < a.length; i++) {
			if (a[i] - a[i - 1] >= key) {
				System.out.println("true");
				return;
			}
		}
		System.out.println("false");
		return;
	}
}
