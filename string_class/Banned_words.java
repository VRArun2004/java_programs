package string_class;

import java.util.Scanner;

public class Banned_words {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array :");
		int size=scan.nextInt();
		String[] badword =new String[size];
		System.out.println("enter the elements in the array :");
		for(int i=0;i<badword.length;i++) {
			badword[i]=scan.nextLine();
		}
		System.out.println("enter the message :");
		String mesg = scan.nextLine();
		System.out.println("is there is any banned word :");
		System.out.println(checkBadword(mesg,badword));
		scan.close();
	}

	public static boolean checkBadword(String mesg,String[] badword) {
		mesg = mesg.toLowerCase();
		for (String bad : badword) {
			if (mesg.contains(bad))
				return true;
		}
		return false;
	}
}
