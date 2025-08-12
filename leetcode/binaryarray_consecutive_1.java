package leetcode;

import java.util.Scanner;

public class binaryarray_consecutive_1 {
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
		int maxCount = 0;
		int currentCount = 0;
		for (int num : a) {
			if (num == 1) {
				currentCount++;
				maxCount = Math.max(maxCount, currentCount);
			} else {
				currentCount = 0;
			}
		}
		System.out.println("max no of consecutive 1's: " + maxCount);
	}
}
