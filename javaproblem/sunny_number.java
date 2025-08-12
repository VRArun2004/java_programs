package javaproblem;

import java.util.Scanner;

public class sunny_number {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		scanner.close();

		boolean isSunny = false;
		int i = 1;
		while (i * i <= num - 1) {
			if (i * i == num - 1) {
				isSunny = true;
				break;
			}
			i++;
		}

		if (isSunny) {
			System.out.println(num + " is a Sunny number.");
		} else {
			System.out.println(num + " is not a Sunny number.");
		}
	}

}
