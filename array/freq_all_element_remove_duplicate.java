package array;

import java.util.Scanner;

public class freq_all_element_remove_duplicate {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of array: ");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("enter the elements of array:");
		for (int i = 0; i < size; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		freq(a);

	}

	public static void freq(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					a[j] = Integer.MAX_VALUE; // insted of zero we use Integer.MAX_VALUE to make condition
				}
			}
			if (a[i] != Integer.MAX_VALUE) {
				System.out.println(a[i] + " 's freq/count is: " + count);
			}
			
			if (a[i] != Integer.MAX_VALUE && count == 1) {
				System.out.println(a[i] + " is unique element ");
			}
			if (a[i] != Integer.MAX_VALUE && count != 1) {
				System.out.println(a[i] + " is duplicate element ");
			}
		}
	}
}
