package array;

import java.util.Scanner;

public class bubble_sort {
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
		System.out.println("Before sorting");
		print(a);
		bubble(a);
		System.out.println("After sorting");
		print(a);

	}

	public static void bubble(int[] a) {
		for (int pass = 0; pass < a.length - 1; pass++) {
			for (int swap = 0; swap < a.length - 1 - pass; swap++) {
				if (a[swap] > a[swap + 1]) {
					int temp = a[swap];
					a[swap] = a[swap + 1];
					a[swap + 1] = temp;
				}
			}
		}
	}

	public static void print(int[] a) {
		for (int i : a) {
			System.out.println(i);
		}
	}
}
