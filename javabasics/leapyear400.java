package javabasics;

import java.util.Scanner;
public class leapyear400 {
	public static void main(String[] args) {
		leap();
	}
public static  void leap() {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the year:");
	int a=scan.nextInt();
	scan.close();
	if((a%4==0&&a%100!=0)||a%400==0) {
	System.out.println(a+" is a leap year");
	return;
	}
	System.out.println(a+" is not a leap year");
}
}
