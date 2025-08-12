package string_class;

import java.util.Scanner;

public class longest_word_string {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the String :");
		String s=scan.nextLine();
		System.out.println("longest word in the String :");
		System.out.println(logestWord(s));
		scan.close();
	}
	public static String logestWord(String s) {
		String[] arr=s.split(" ");
		int count =0;
		String res="";
		for(String str : arr) {
			if(count<str.length()) {
				count=str.length();
				res=str;
			}
		}
		return res;
	}
}
