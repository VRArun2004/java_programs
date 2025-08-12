package string_class;

import java.util.Scanner;

public class remove_duplicate {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the name :");
		String n = scan.nextLine();
		System.out.println("duplicate removed string :");
		System.out.println(removeDuplicate(n));
		scan.close();
	}

	public static String removeDuplicate(String n) {
		n.toLowerCase();
		String s = "";
		for (int i = 0; i < n.length(); i++) {
			char ch = n.charAt(i);
			if (!(s.contains(ch + ""))) {
				s += ch;
			}
		}
		return s;
	}
}
