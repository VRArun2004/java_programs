package assignment;

import java.util.Scanner;

public class prog1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number: ");
		int num=scan.nextInt();
		scan.close();
		int temp=num;
		int prod=1;
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		while(count!=0) {
			while(temp!=0) {
			int rev=temp%10;
			prod=prod*rev;
			temp=temp/10;
		}
			if(count>2) {
				temp=prod;
			}
			count--;
		}
		System.out.println(prod);
	}
}
