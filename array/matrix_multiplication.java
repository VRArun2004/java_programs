package array;

import java.util.Scanner;

public class matrix_multiplication {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the no of rowa: ");
		int rowa = scan.nextInt();
		System.out.println("enter the no of cola: ");
		int cola = scan.nextInt();
		System.out.println("enter the no of colb: ");
		int colb = scan.nextInt();
		int[][] a = new int[rowa][cola];
		System.out.println("enter the elements of A: ");
		read(a,scan);
		int[][] b = new int[cola][colb];
		System.out.println("enter the elements of B: ");
		read(b,scan);
		scan.close();
		int[][] c = multi(rowa, cola, colb, a, b);
		System.out.println("the multiplication of A and B matrix: ");
		print(c);
	}

	public static int[][] multi(int rowa, int cola, int colb, int[][] a, int[][] b) {
		int[][] c = new int[rowa][colb];
		for (int i = 0; i < rowa; i++) {
			for (int j = 0; j < colb; j++) {
				for (int k = 0; k < cola; k++) {

					c[i][j] = c[i][j] + a[i][k] * b[k][j];

				}
			}
		}
		return c;
	}

	public static void read(int[][] p,Scanner scan) {
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p[i].length; j++) {
				p[i][j] = scan.nextInt();
			}
		}
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
