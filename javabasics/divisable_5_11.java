package javabasics;

import java.util.Scanner;
public class divisable_5_11 {
	public static void main(String[] args) {
		name();
		
	}
	public static void name() {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int a=scan.nextInt();
		scan.close();
		if(a%5==0&&a%11==0) {
			System.out.println(a+" is divisable by 5 and 11");
		}
		else {
			System.out.println(a+" is not divisable by 5 and 11");
		}
		}

}
