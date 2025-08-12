package phase2;
import java.util.Scanner;
public class array_even_odd_1_2half {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size=scan.nextInt();
		int []a=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		scan.close();
		System.out.println(even1halfaverage(a));
		System.out.println(odd2halfaverage(a));
				
	}
	public static int even1halfaverage(int[] a) {
		if(a==null || a.length==0)return -1;
		int mid=(a.length-1)/2,sum=0,count=0;
		for(int i=0;i<mid;i+=2) {
				sum+=a[i];
				count++;
				}
		System.out.println("even average of first half");
		return sum/count;
		}
		
	public static int odd2halfaverage(int[] a) {
		int add=0;
		int count=0;
		for(int i=(a.length-1)/2;i<a.length;i++) {
			if(i%2!=0) {
				add=add+a[i];
				count++;
			}
		}
		System.out.println("odd avrage of second half:");
		return add/count;
	}
}
