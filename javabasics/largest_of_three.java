package javabasics;

import java.util.Scanner;
public class largest_of_three {
	public static void main(String[] args) {
		largest_of_three output=new largest_of_three();
		output.three();
	}
	public  void three() {
		Scanner scan=new Scanner(System.in);
	    System.out.println("enter the first number");
	    int a=scan.nextInt();
	    System.out.println("enter the first number");
	    int b=scan.nextInt();
	    System.out.println("enter the first number");
	    int c=scan.nextInt(); 
	    String res1=a>b&&a>c?" is":" is not";
		System.out.println(a+res1+" the largest number");
		String res2=b>c&&b>a?" is":" is not";
		System.out.println(b+res2+" the largest number");
		String res3=c>a&&c>b?" is":" is not";
		System.out.println(c+res3+" the largest number");
		scan.close();
    }

}
