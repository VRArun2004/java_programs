package array;

import java.util.Scanner;

public class matrix_upper_triangular {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the no of row: ");
		int row = scan.nextInt();
		System.out.println("enter the no of col: ");
		int col = scan.nextInt();
		int[][] a = new int[row][col];
		System.out.println("enter the elements: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		scan.close();
		System.out.println("the readed A matrix: ");
		print(a);
		int[][] b = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(i>j) {
					b[i][j]=0;
				}else {
				b[i][j] = a[i][j];
				}
			}
		}
		System.out.println("the uppper triangular matrix: ");
		print(b);
	}

	public static void print(int[][] c) {
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
