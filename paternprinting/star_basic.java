package paternprinting;

import java.util.Scanner;

public class star_basic {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the range:");
		int num = scan.nextInt();
		scan.close();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
