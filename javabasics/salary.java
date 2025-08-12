package javabasics;
import java.util.Scanner;
public class salary {
	public static void main(String[] args) {
		sal();
	}
	public static void sal() {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the gender(M/F):");
		char gender=scan.next().charAt(0);
		System.out.println("enter the qualification(P/G):");
		char quali=scan.next().charAt(0);
		System.out.println("enter the experience");
		int exp=scan.nextInt();
		scan.close();
		System.out.println("salary eligibality:");
		if(gender=='M') {
			if(exp>=10&&quali=='P') {
				System.out.println(15000);
			}else if(exp>=10&&quali=='G') {
				System.out.println(10000);
			}else if(exp<10&&quali=='P') {
				System.out.println(10000);
			}else if(exp<10&&quali=='G'){
				System.out.println(7000);
			}
		}else if(gender=='F') {
			if(exp>=10&&quali=='P') {
				System.out.println(12000);
			}else if(exp>=10&&quali=='G') {
				System.out.println(9000);
			}else {
				System.out.println(6000);
			}
		}
		
	}

}
