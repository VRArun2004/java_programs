package string_class;

import java.util.Scanner;

public class Frequency_of_each_character {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the String :");
		String s = scan.nextLine();
		System.out.println("Frequency of characters :");
		System.out.println();
		frequencyCheck(s);
		scan.close();
	}

	public static void frequencyCheck(String s) {
		s = s.toLowerCase();
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!(res.contains(ch + ""))) {
				res += ch;
			}
		}
		for (int i = 0; i < res.length(); i++) {
			int count = 0;
			char ch = res.charAt(i);
			for (int j = i; j < s.length(); j++) {
				char ch1 = s.charAt(j);
				if (ch == ch1) {
					count++;
				}
			}
			System.out.println("Frequency of '" + ch + "' : " + count);
		}
	}
}
