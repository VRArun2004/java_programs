package array;

import java.util.Scanner;

public class reverse_half_array {
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
		reverse(a);
		System.out.println("Reversed array: ");
		print(a);
	}

	public static void reverse(int[] a) {
		int start = 0;
		int end = (a.length - 1) / 2;
		while (start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}

	public static void print(int[] a) {
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
}
