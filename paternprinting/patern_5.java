package paternprinting;

import java.util.Scanner;

public class patern_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter an number :");
		int n = scan.nextInt();
		scan.close();
		for(int row=1;row<=n*2-1;row++) {
			for(int col=1;col<=n*2-1;col++) {
			if(col-row>=n-1 ||row-col>=n-1||col+row<=n+1||row+col>=n*3-1)
					System.out.print("* ");
			else {
				System.out.print("  ");
			}
				
			}
		
			System.out.println();
		}
	}
}
