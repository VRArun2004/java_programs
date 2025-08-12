package array;

import java.util.Scanner;

public class elements_array_for_each {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length: ");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("enter  the elements:");
		for (int i = 0; i < size; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		System.out.println("elements of the array:");
		print(a);

	}

	public static void print(int[] a) {
		for (int i : a) {
			System.out.println(i);
		}
	}

}
