package javaproblem;

import java.util.Scanner;

public class product_digit {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		scan.close();
		int mul=1;
		while(num!=0) {
			int rem=num%10;
			mul=mul*rem;
			num=num/10;
		}
		System.out.println(mul);
	}

}
