package string_class;

import java.util.Scanner;

public class Same_formate_upper {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the name :");
		String n = scan.nextLine();
		System.out.println("formated  to upper case :");
		System.out.println(toupper(n));
		System.out.println("formated  to lower case :");
		System.out.println(tolower(n));
		scan.close();
	}

	public static String toupper(String n) {
		String res = "";
		for (int i = 0; i < n.length(); i++) {
			char ch = n.charAt(i);
			if (ch >= 97 && ch <= 123) {
				char b = (char) (ch - 32);
				res = res + b;
			} else {
				res = res + ch;
			}
		}
		return res;
	}

	public static String tolower(String n) {
		String res = "";
		for (int i = 0; i < n.length(); i++) {
			char ch = n.charAt(i);
			if (ch >= 65 && ch <= 91) {
				ch+=32;
				res = res + ch;
			} else {
				res = res + ch;
			}
		}
		return res;
	}
}
