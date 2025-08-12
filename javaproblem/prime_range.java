package javaproblem;

import java.util.Scanner;

public class prime_range {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the starting range:");
		int num = scan.nextInt();
		System.out.println("enter the ending range:");
		int num1 = scan.nextInt();
		scan.close();
		System.out.println("prime number between " + num + " to " + num1 + " are");
		for (; num <= num1; num++) {
			int count = 0;
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(num);
			}
		}
	}

}
