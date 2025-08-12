package paternprinting;

import java.util.Scanner;

public class patern_plus_hash {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter an odd number: ");
		int num = scan.nextInt();
		scan.close();
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				if (row == num / 2 + 1 && col == num / 2 + 1) {
					System.out.print("# ");
				} else if (row == num / 2 + 1 || col == num / 2 + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}

	}
}
