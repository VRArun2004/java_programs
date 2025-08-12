package leetcode;

import java.util.*;

public class multi_of_all_elem_except_self {
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
		for(int i=0;i<a.length;i++) {
			int prod=1;
			for(int j=0;j<a.length;j++) {
				if(i!=j) {
					prod*=a[j];
				}
				b[i]=prod;
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("output: ");
		System.out.println(Arrays.toString(b));
	}
}