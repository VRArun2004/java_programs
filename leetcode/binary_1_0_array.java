package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class binary_1_0_array {
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
		int[] b=new int[a.length];
		int index=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>0) {
				b[index]=a[i];
				index++;
			}
			}

		System.out.println(Arrays.toString(b));
	}}
