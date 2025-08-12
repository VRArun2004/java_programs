package javabasics;

import java.util.Scanner;

public class amstrong_num {
	public static void main(String[] args) {
		amstrong();
	}

	public static void amstrong() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		scan.close();
		int temp = num;
		int temp1 = temp;
		int count = 0;
		while (temp != 0) {
			temp = temp / 10;
			count++;
		}
		System.out.println("the count of the given number: "+count);
		int sum = 0;
		while (temp1 != 0) {
			int rem = temp1 % 10;
			int pow = count;
			int prod = 1;
			while (pow != 0) {
				prod = prod * rem;
				pow--;
			}
			temp1 = temp1 / 10;
			sum = sum+prod;
		}
		if (sum == num) {
			System.out.println("it is the armstrong number");
		} else {
			System.out.println("it is not the armstrong number");
		}
	}

}
