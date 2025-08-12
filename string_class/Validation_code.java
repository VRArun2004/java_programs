package string_class;

import java.util.Scanner;

public class Validation_code {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the 4 digit code");
		String c = scan.nextLine();
		System.out.println("code status :");
		System.out.println(verifyCode(c));
		scan.close();
	}

	public static boolean verifyCode(String c) {
		if (c.length() != 4) {
			return false;
			
		}
		for (int i = 0; i < c.length(); i++) {
			char ch = c.charAt(i);
		        if (ch < '0' || ch > '9') {
		            return false;
		        }
		}
		return true;
	}
}
