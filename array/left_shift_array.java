package array;

import java.util.Scanner;

public class left_shift_array {
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
		System.out.println("left shifted array: ");
		print(a);
	}

	public static void shift(int[] a) {
		int n = a.length - 1;
		int first = a[0];
		for (int i = 0; i < n; i++) {
			a[i] = a[i + 1];
		}
		a[n] = first;
	}

	public static void print(int[] a) {
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
}
