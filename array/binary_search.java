package array;

import java.util.Arrays;
import java.util.Scanner;

public class binary_search {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length: ");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("enter  the elements");
		for (int i = 0; i < size; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("enter the element to search:");
		int target = scan.nextInt();
		scan.close();
		Arrays.toString(a);
		int low=0;
		int high=a.length-1;
		int mid=(low+high)/2;
		while(low<high) {
			
			if(a[mid]==target) {
			System.out.println(mid);
			}else if(a[mid]>target) {
				low=mid+1;
			}else {
				high=mid+1;
			}
		}
	}
}