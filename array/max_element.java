package array;

import java.util.Scanner;

public class max_element {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length: ");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("enter  the elements");
		for (int i = 0; i < size; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		int res = max_elem(a);
		System.out.println("maximum value in array: " + res);
	}

	public static int max_elem(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}

}
