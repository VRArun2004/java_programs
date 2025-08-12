package array;

import java.util.Scanner;

public class right_shift_array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length oif array: ");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("enter the elements of array:");
		for (int i = 0; i < size; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		shift(a);
		System.out.println("Right shifted array: ");
		print(a);
	}

	public static void shift(int[] a) {
		int n = a.length - 1;
		int last = a[n];
		for (int i = n; i > 0; i--) {
			a[i] = a[i - 1];
		}
		a[0] = last;
	}

	public static void print(int[] a) {
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
}
