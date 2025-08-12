package string_class;

import java.util.Scanner;

public class code_decode {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the message :");
		String mesg = scan.nextLine();
		System.out.println("coded message :");
		System.out.println(reverse(mesg));
		scan.close();
	}

	public static String reverse(String mesg) {
		if (mesg == null || mesg.length() < 1)
			return null;
		int length = mesg.length();
		String res = "";
		int end = length - 1;
		for (int i = end; i >= 0; i--) {
			res = res + mesg.charAt(i);
		}
		return res;

	}
}
