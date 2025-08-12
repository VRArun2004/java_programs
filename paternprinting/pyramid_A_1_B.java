package paternprinting;

import java.util.Scanner;

public class pyramid_A_1_B {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter an number");
		int num = scan.nextInt();
		scan.close();
		char ch = 'A';
		int a = 1;
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num * 2 - 1; col++) {
				if (row + col >= num + 1 && col - row <= num - 1) {
					if (row % 2 != 0) {
						System.out.print(ch + " ");
						ch++;
					} else {

						System.out.print(a + " ");
						a++;
					}
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
