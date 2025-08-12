package leetcode;

import java.util.Scanner;

public class max_difference_array {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of array: ");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("enter the elements of array: ");
		for (int i = 0; i < size; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] - a[i] > max && i < j) {
					max=a[j]-a[i];
				}
			}
		}
		System.out.println("the maximum difference: "+max);
	}
}