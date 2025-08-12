package javabasics;

import java.util.Scanner;

public class vovels_consonent {
	public static void main(String[] args) {
		vovel();
	}

	public static void vovel() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter an alphabet");
		char c = scan.next().charAt(0);
		scan.close();
		if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {
				System.out.println(c + " is an vowel");
			} else {
				System.out.println(c + " is an consonent");
			}
		} else {
			System.out.println("enter an valid alphabet");
		}
	}

}
