package array;

import java.util.Scanner;

public class min_element {
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
		int res = min_elem(a);
		System.out.println("minimum value in array: " + res);
	}

	public static int min_elem(int[] a) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		return min;
	}

}
