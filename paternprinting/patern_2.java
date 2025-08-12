package paternprinting;

import java.util.Scanner;

public class patern_2 {
	public static void main(String[] args) {
		pyramid();
	}

	public static void pyramid() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter an number");
		int num = scan.nextInt();
		scan.close();
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num * 2 - 1; col++) {
				if (row >= col || row + col >= num * 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}