package string_class;

import java.util.Scanner;

public class roman_letter {
	
	public static int valueOfRomanChar(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0; // or throw an error for invalid input
		}
	}

	public static int romanToInt(String s) {
		int result = 0;
		int prevValue = 0;

		for (int i = s.length() - 1; i >= 0; i--) {
			int currentValue = valueOfRomanChar(s.charAt(i));
			if (currentValue < prevValue) {
				result -= currentValue;
			} else {
				result += currentValue;
			}
			prevValue = currentValue;
		}
		return result;
	}

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a Roman numeral: ");
	        String roman = scanner.nextLine().toUpperCase();
	        scanner.close();

	        System.out.println("Integer value: " + romanToInt(roman));
	}
}
