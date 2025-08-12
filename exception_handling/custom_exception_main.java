package exception_handling;

import java.util.Scanner;

public class custom_exception_main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter age:");
		int age = scan.nextInt();
		scan.close();
		if (age > 18) {
			System.out.println("Eligible for voting");
		} else {
			throw new invalidAgeException();
		}
	}
}
