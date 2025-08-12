package paternprinting;

import java.util.Scanner;

public class diagonal_x {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the range:");
		int num = scan.nextInt();
		scan.close();
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				if (row == col || row + col == num + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
