package paternprinting;

import java.util.Scanner;

public class pyramid_1_1_1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter an number");
		int num = scan.nextInt();
		scan.close();
		int a = 1;
		for (int row = 1; row <= num; row++) {
			int b = a;
			for (int col = 1; col <= num * 2 - 1; col++) {
				if (row + col >= num + 1 && col - row <= num - 1) {
					System.out.print(b + " ");
					b++;
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
