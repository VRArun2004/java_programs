package string_class;

import java.util.*;

public class Palindrome_Array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array :");
		int size = scan.nextInt();
		scan.nextLine();
		System.out.println("enter the String :");
		String[] s = new String[size];
		for (int i = 0; i < size; i++) {
			s[i] = scan.nextLine();
		}
		System.out.println("palindrome array :");
		String[] a = palindrome_array(s);
		System.out.println(Arrays.toString(a));
		scan.close();
	}

	public static boolean checkpalindrome(String m) {
		int i = 0;
		int j = m.length() - 1;
		while (i < j) {
			if (m.charAt(i) == m.charAt(j)) {
				i++;
				j--;
			} else {
				return false;
			}
		}
		return true;
	}

	public static String[] palindrome_array(String[] s) {
		int count = 0;
		for (String str : s) {
			if (checkpalindrome(str)) {
				count++;
			}
		}
		String[] res = new String[count];
		int index = 0;
		for (String str : s) {
			if (checkpalindrome(str)) {
				res[index] = str;
				index++;
			}
		}
		return res;
	}
}
