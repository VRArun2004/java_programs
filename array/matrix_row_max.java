package array;

import java.util.Scanner;

public class matrix_row_max {
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
		System.out.println("the readed square matrix: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		maximum(a);

	}

	public static void maximum(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			int max = a[i][0];
			for (int j = 0; j < a[i].length; j++) {
				if (max < a[i][j]) {
					max = a[i][j];
				}
			}
			System.out.println("the max value in " + i + "th row: " + max);
		}
	}
}
