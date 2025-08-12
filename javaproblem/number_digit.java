package javaproblem;

import java.util.Scanner;

public class number_digit {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num = scan.nextInt();
		scan.close();
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		System.out.println("the number of digits in the number: "+count);
	}

}
