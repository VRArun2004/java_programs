package javaproblem;

import java.util.Scanner;

public class count_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num = scan.nextInt();
		scan.close();
		int count=0;
		while(num!=0) {
			int rev=num%10;
			num=num/10;
			if(rev==5) {
				count++;
			}
		}
		System.out.println("no of 5 present in the entered number: "+count );
}}
