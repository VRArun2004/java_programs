package threads;

import java.util.Arrays;
import java.util.Scanner;

public class Check_Array_sorted {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size=scan.nextInt();
		int[]arr=new int[size];
		System.out.print("Enter the elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		scan.close();
		System.out.println(checkSorted(arr));
		missing(arr);
	}

	public static boolean checkSorted(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) return false;
			
		}
		return true;
	}
	public static void missing(int[] a) {
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++) {
			if(a[i+1]-a[i]>1) {System.out.println(a[i]+1);}
			
		}
		
	}
}
