package array;

import java.util.Scanner;

public class remove_elem_array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length oif array: ");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("enter the elements of array:");
		for (int i = 0; i < size; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("enter an index to remove: ");
		int index = scan.nextInt();
		scan.close();
		int[] b = new int[size - 1];
		remove(a, b, index);
		System.out.println("New array: ");
		print(b);

	}

	public static void remove(int[] a, int[] b, int index) {
		for (int i = 0; i < index; i++) {
			b[i] = a[i];
		}
		for (int i = index + 1; i < a.length; i++) {
			b[i - 1] = a[i];
		}
	}

	public static void print(int[] b) {
		for (int i : b) {
			System.out.print(i + " ");
		}
	}
}