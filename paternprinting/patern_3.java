package paternprinting;

import java.util.Scanner;

public class patern_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number: ");
		int n = scan.nextInt();
		scan.close();
		for (int row = 1; row <= n * 2 - 1; row++) {
			for (int col = 1; col <= n * 2 - 1; col++) {
				if (row <= col && col + row >= n * 2 || row >= col && col + row <= n * 2)
					System.out.print("* ");
				else {
					System.out.print("  ");
				}

			}

			System.out.println();
		}
	}
}
