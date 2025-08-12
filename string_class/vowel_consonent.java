package string_class;

import java.util.Scanner;

public class vowel_consonent {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the message :");
		String mesg = scan.nextLine();
		System.out.println("vowel  consonent count :");
		countvowelconsonent(mesg);
		scan.close();
	}

	public static void countvowelconsonent(String mesg) {
		int vowelCount = 0;
		int consonentCount = 0;
		mesg=mesg.toLowerCase();
		for (int i = 0; i < mesg.length(); i++) {
			char ch =mesg.charAt(i);
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' ) {
				vowelCount++;
			}else if(ch>='a'&&ch<='z') {
				consonentCount++;
			}
		}
		System.out.println(vowelCount+"  "+consonentCount);
	}
}
