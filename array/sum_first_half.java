package array;

import java.util.Scanner;

public class sum_first_half {
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
		int res=sum_elem(a);
		System.out.println("sum of elements in array: "+res);
	}

	public static int sum_elem(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum;

	}
}
