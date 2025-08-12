package javaproblem;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		prime_num();
	}

	public static void prime_num() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		scan.close();
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("prime number");
		} else {
			System.out.println("not a prime number");

		}

	}

}
