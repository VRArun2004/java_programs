package javaproblem;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num = scan.nextInt();
		scan.close();
		int temp = num;
		int rev = 0;
		while (num > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (temp == rev) {
			System.out.println("it is an palindrome");
			System.out.println(rev);
		} else {
			System.out.println("it is not a palindrome");
			System.out.println(rev);
		}

	}
}
