package string_class;

import java.util.Scanner;

public class Bijunction {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String pattern = scan.nextLine();
		String s = scan.nextLine();
		System.out.println(bijunct(pattern, s));
		scan.close();
	}

	public static boolean bijunct(String pattern, String s) {
		String[] words = s.split(" ");
		if (pattern.length() != words.length)
			return false;

		for (int i = 0; i < pattern.length(); i++) {
			char c = pattern.charAt(i);
			String w = words[i];

			// Find first occurrence index of c in pattern
			int firstCharIndex = -1;
			for (int j = 0; j < i; j++) {
				if (pattern.charAt(j) == c) {
					firstCharIndex = j;
					break;
				}
			}

			// Find first occurrence index of w in words
			int firstWordIndex = -1;
			for (int j = 0; j < i; j++) {
				if (words[j].equals(w)) {
					firstWordIndex = j;
					break;
				}
			}

			// If indexes do not match, pattern does not hold
			if (firstCharIndex != firstWordIndex)
				return false;
		}

		return true;
	}
}