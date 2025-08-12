package leetcode;

import java.util.Scanner;

public class count_pair_equal_sum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of array: ");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("enter the elements of array: ");
		for (int i = 0; i < size; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("enter the sum of pairs:");
		int sum=scan.nextInt();
		
		scan.close();
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==sum) {
					count++;
				}
			}
		}
		System.out.print("count of pairs : "+count);

	}
    }
