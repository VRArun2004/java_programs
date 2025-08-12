// j p to print numbers from 1 to 10
package javabasics;
import java.util.Scanner;
public class mum {
	public static void main(String[] args) {
		range();	
	}
public static void range() {
	Scanner scan=new Scanner(System.in);
	int a=1;
	System.out.println("enter the end of range: ");
	int b=scan.nextInt();
	scan.close();
	int sum=0;
	while(a<=b) {
		sum=sum+a;
		a++;
	}
	System.out.println("the summation of numbers in the given series: "+sum);
}
}
