package array;

import java.util.Scanner;

public class array_reverse_individual_alements {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length : ");
		int r = scan.nextInt();
		int[] a = new int[r];
		System.out.println("enter the elements: ");
		for (int i = 0; i < a.length; i++) {

			a[i] = scan.nextInt();
		}
		scan.close();
		System.out.println("original array: ");
		print(a);

		for (int i = 0; i < a.length; i++) {
			int num = a[i];
			int rev = 0;
			while (num != 0) {
				int rem = num % 10;
				rev = rev * 10 + rem;
				num = num / 10;
			}
			a[i] = rev;
		}
		System.out.println(" individual element reversed array: ");
		print(a);

	}

	public static void print(int[] c) {
		for (int i = 0; i < c.length; i++) {

			System.out.print(c[i] + " ");
		}
		System.out.println();
	}
}
