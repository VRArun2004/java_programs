package leetcode;

import java.util.Scanner;

public class count_subarray_equal_target {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of array: ");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("enter the elements of array: ");
		for (int i = 0; i < size; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("enter the target sum:");
		int target=scan.nextInt();
		scan.close();
		int count=0;
		for (int pass = 0; pass < a.length; pass++) {
			for (int end = pass; end < a.length; end++) {
				int sum=0;
				for (int j = pass; j <= end; j++) {
				sum+=a[j];
				}
				if(sum==target) {
					count++;
				}
			
			}
	
		} 
		System.out.print("count of sum of sub array equal to target: "+count);
	}
}
