package javabasics;
import java.util.Scanner;

public class triangle {
	public static void main(String[] args) {
		tri();
	}
public static void tri() {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the the first angle");
	int a=scan.nextInt();
	System.out.println("enter the the second angle");
	int b=scan.nextInt();
	System.out.println("enter the the third angle");
	int c=scan.nextInt();
	scan.close();
	if(a+b+c==180) {
		System.out.println("it is an valid triangle");
		return;
	}
	System.out.println("it is not an valid triangle");
}

}
