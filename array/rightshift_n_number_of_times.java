package array;

import java.util.Scanner;

public class rightshift_n_number_of_times {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length oif array: ");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("enter the elements of array:");
		for (int i = 0; i < size; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("enter the number of shift: ");
		int num = scan.nextInt();
		scan.close();
		System.out.println("Before Right shifted array: ");
		print(a);
		System.out.println();
		num_shift(a, num);
		System.out.println(" After Right shifted array: ");
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

	public static void num_shift(int[] a, int num) {
		for (int i = 0; i < num; i++) {
			shift(a);
		}
	}

	public static void print(int[] a) {
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
}
