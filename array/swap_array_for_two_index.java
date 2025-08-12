package array;

import java.util.Scanner;

public class swap_array_for_two_index {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length: ");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("enter  the elements: ");
		for (int i = 0; i < size; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("enter the index 1: ");
		int ind1 = scan.nextInt();
		System.out.println("enter the index 2: "); 
		int ind2 = scan.nextInt();
		scan.close();
		System.out.println("before swap:");
		print(a);
		swap(a, ind1, ind2);
		System.out.println();
		System.out.println("after swap:");
		print(a);

	}

	public static int[] swap(int[] a, int ind1, int ind2) {
		int temp = a[ind1];
		a[ind1] = a[ind2];
		a[ind2] = temp;
		return a;
	}

	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
