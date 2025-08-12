package javaproblem;
import java.util.Scanner;
public class worker_hour {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the time taken by the worker");
		int time=scan.nextInt();
		scan.close();
		work(time);	
	}
		public static void work(int time) {

			System.out.println(time);
		}
	
}
