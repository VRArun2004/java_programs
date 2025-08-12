package javabasics;

import java.util.Scanner;

public class largest_of_two {
	public static void main(String[] args) {
		System.out.println(two() + " number");
	}
	public static String two(){
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the 1st number");
	int a=scan.nextInt();
	System.out.println("enter the 2nd mumber");
	int b=scan.nextInt();
	String res=a>b?a+" is largest":b+" is largest";
	scan.close();
	return res;
	}
}
