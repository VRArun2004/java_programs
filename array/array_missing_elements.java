package array;

import java.util.Scanner;

public class array_missing_elements {
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
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
			if (min > a[i]) {
				min = a[i];
			}
			
		}
		System.out.println("the missing elements are");
		for(int i=min;i<=max;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(i==a[j]) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(i);
			}
		}
	}
}
