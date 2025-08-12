package paternprinting;

import java.util.Scanner;

public class patern_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter an range: ");
		int num = scan.nextInt();
		scan.close();
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num * 2 - 1; col++) {
				if (row + col <= num + 1 || col - row >= num - 1) {
					System.out.print("* ");

				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
