package string_class;

import java.util.Scanner;

public class clean_palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the message :");
		String mesg = scan.nextLine();
		System.out.println("palindrome exist or not :");
		System.out.println(checkpalindrome(mesg));
		scan.close();
	}

	public static  boolean checkpalindrome(String mesg) {
		String res="";
		mesg=mesg.toLowerCase();
		for(int i=0;i<mesg.length();i++) {
			char ch=mesg.charAt(i);
		if(ch>='a'&&ch<='z') {
			res = res + ch;
			}
		}
		String res1 = "";
		int length = res.length();
		int end = length - 1;
		for (int i = end; i >= 0; i--) {
			res1 = res1 + res.charAt(i);
		}
		if(res.equals(res1))
			return true;
		return false;
	}
}
