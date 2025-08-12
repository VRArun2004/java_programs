package leetcode;

import java.util.Scanner;

public class rat_food {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("no of rat");
		int rat=scan.nextInt();
		System.out.println("no of unit");
		int unit=scan.nextInt();
		System.out.println("enter the length of array: ");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("enter the elements of array: ");
		for (int i = 0; i < size; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		int food=rat*unit;
		for (int i = 0; i < a.length; i++) {
			int sum=a[i];
			for (int j = i+1; j < a.length; j++) {
				sum=sum+a[j];
				if(sum>=food) {
					System.out.println("no of houses");
					System.out.println(j+1);
					return;
				}
			}
		}
	}
}
