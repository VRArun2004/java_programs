package javaproblem;

import java.util.Scanner;

public class spy_num {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		scan.close();
		int sum = 0;
		int mul = 1;
		while (num != 0) {
			int rem = num % 10;
			sum = sum + rem;
			mul = mul * rem;
			num = num / 10;
		}
		if (sum == mul) {
			System.out.println("SPY number");
		} else {
			System.out.println(" not a SPY number");
		}
	}
}
