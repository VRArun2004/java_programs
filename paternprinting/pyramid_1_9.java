package paternprinting;

import java.util.Scanner;

public class pyramid_1_9 {
	public static void main(String[] args) {
		pyramid();
	}

	public static void pyramid() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of rows");
		int num = scan.nextInt();
		scan.close();
		int n = 1;
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num * 2 - 1; col++) {
				if (row + col >= num + 1 && col - row <= num - 1) {
					System.out.print(n + " ");
					n++;
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
