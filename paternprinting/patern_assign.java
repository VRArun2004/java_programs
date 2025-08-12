package paternprinting;

import java.util.Scanner;

public class patern_assign {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter an odd range: ");
		int num = scan.nextInt();
		scan.close();
		char ch = 'A';
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				if (row == col) {
					System.out.print(ch);
					ch++;
				} else {
					System.out.print(row + col);
				}
			}
			System.out.println();
		}
	}
}
