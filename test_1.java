import java.util.Scanner;

public class test_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		int col=s.nextInt();
		int[][] a=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("no of magical rows:");
		System.out.println(check(a, row, col));
		s.close();
	}
	public static int check(int[][] a,int row,int col) {
		int count=0;
		for(int i=0;i<row;i++) {
			int sum=0;
			for(int j=0;j<col;j++) {
				if(a[i][j]%2!=0) {
					sum+=a[i][j];
					}
				}
			if(sum%2==0&&sum!=0) {
				count++;
			}
			}
		return count;
	}
}
