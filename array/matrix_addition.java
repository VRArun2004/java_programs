package array;
import java.util.Scanner;
public class matrix_addition {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the no of row: ");
			int row = scan.nextInt();
			System.out.println("enter the no of col: ");
			int col = scan.nextInt();
			int[][] a = new int[row][col];
			System.out.println("enter the elements of A: ");
			read(a);
			int[][] b=new int[row][col];
			System.out.println("enter the elements of B: ");
			read(b);
			scan.close();
			int[][] c = addition(row, col, a,b);
			System.out.println("the addition of A and B matrix: ");
			print(c);
		}

		public static int[][] addition(int row, int col, int[][] a,int[][] b) {
			int[][] c = new int[col][row];
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					c[i][j]=a[i][j]+b[i][j];
				}
			}
			return c;
		}
		public static void read(int[][] c) {
			Scanner scan=new Scanner(System.in);
			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j <c[i].length; j++) {
					c[i][j] = scan.nextInt();
				}
			}
			scan.close();
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
