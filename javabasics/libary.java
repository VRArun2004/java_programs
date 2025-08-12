package javabasics;
import java.util.Scanner;
public class libary {
public static void main(String[] args) {
	lib();
}
public static void lib() {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number of book:");
	int count_book=scan.nextInt();
	System.out.println("number of days after return date:");
	int day=scan.nextInt();
	scan.close();
	System.out.println("your fine status: ");
	if(day>=1&&day<=5) {
		System.out.println(count_book*day*0.5);
	}else if(day>=6&&day<=10) {
		System.out.println(count_book*day*1);
	}else if(day>10&&day<=30) {
		System.out.println(count_book*day*5);
	}else if(day>30){
		System.out.println("your membership get cancelled");
	}else {
		System.out.println("no fine");
	}
}
}
