// j p to get an char input from user and convert it into upper case to lower case
package javabasics;

import java.util.Scanner;

public class alpha_conversion {
	public static void main(String[] args) {
		alpha();
	}

	public static void alpha() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter an alphabet:");
		char a = scan.next().charAt(0);
		scan.close();
		if (a >= 'A' && a <= 'Z') {
			System.out.println((char) (a + 32));
		} else if (a >= 'a' && a <= 'z') {
			System.out.println((char) (a - 32));
		}

	}
}
