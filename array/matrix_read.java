package array;
import java.util.Scanner;
public class matrix_read {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the no of row: ");
	int row=scan.nextInt();
	System.out.println("enter the no of col: ");
	int col=scan.nextInt();
	int[][] a=new int[row][col];
	System.out.println("enter the elements: ");
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			a[i][j]=scan.nextInt();
		}
	}
	scan.close();
	System.out.println("the readed square matrix: ");
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
}

}
