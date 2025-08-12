package javaproblem;

import java.util.Scanner;

public class power_number {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num = scan.nextInt();
		System.out.println("enter the power: ");
		int pow = scan.nextInt();
		scan.close();
		int prod = 1;
		while (pow > 0) {
			prod = prod * num;
			pow--;
		}
		System.out.println("the power value is: " + prod);
	}
}
