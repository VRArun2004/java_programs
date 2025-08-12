package leetcode;

import java.util.Scanner;

public class majority_element_array {
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
		for(int i=0;i<a.length;) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
				i++;
			}
			if(count>a.length/2) {
				System.out.println("majority element is: "+a[i]);
			break;
			}else {
				System.out.println(-1);
				break;
			}
		}
	
	}
}