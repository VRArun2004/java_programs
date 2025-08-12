package array;

import java.util.Scanner;

public class array_missing_element {
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
		int max = a[0];
		int min = a[0];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i]; 
			}
			if (min > a[i]) {
				min = a[i];
			}
			sum = sum + a[i];
		}
		int sum2 = 0;
		for (int i = min; i <= max; i++) {
			sum2 = sum2 + i; // sum2+=i;
		}
		System.out.println("the missing element in the array: ");
		System.out.println(sum2 - sum);
	}
}
