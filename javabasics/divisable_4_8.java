package javabasics;

import java.util.Scanner;
public class divisable_4_8 {
public static void main(String[] args) {
	System.out.println(divisable());
}
private static String divisable() {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int a=scan.nextInt();
	String res=a%4==0&&a%8==0?a+" is divisable by 4 and 8":a+" is not divisable by 4 and 8";
	scan.close();
	return res;
	
}
}
