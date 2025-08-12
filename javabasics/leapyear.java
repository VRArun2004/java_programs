package javabasics;
//java prog to check leap year or not using conditional operator ,input from the user
import java.util.Scanner;
public class leapyear {
	public static void main(String[] args) {
		System.out.println(year());
	}
public static String year() {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the year");
	int a=scan.nextInt();
	String res= a%4==0?" it is leap year":"it is not leap year";
	scan.close();
	return res;
}
}
