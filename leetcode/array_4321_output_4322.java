package leetcode;

import java.util.*;

public class array_4321_output_4322 {

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

		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] < 9) {
				a[i] += 1;
				break;
			}else {
				a[i]=0;
			}
			
		}
		System.out.println(Arrays.toString(a));
	}
}
