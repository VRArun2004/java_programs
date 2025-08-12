package array;

import java.util.Scanner;

public class print_sub_array {
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
		System.out.println("the sub arrays are: ");
		for (int pass = 0; pass < a.length; pass++) {
			for (int end = pass; end < a.length; end++) {
				for (int j = pass; j <= end; j++) {
					System.out.print(a[j]+" ");
				}
				System.out.println();
			}
			System.out.println();	
		} 
	}

}
