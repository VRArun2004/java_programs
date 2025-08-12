package javaproblem;

import java.util.Scanner;

public class fibonacci_series {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num = scan.nextInt();
		scan.close();
		int num1=0;
		int num2=1;
		System.out.println("first "+num+" fibonacci series: ");
		for(int i=1;i<=num;i++) {
			System.out.println(num1);
			int sum = num1+num2;
			num1=num2;
			num2=sum;
		}
		
	}

}
