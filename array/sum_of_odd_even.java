package array;

import java.util.Scanner;

public class sum_of_odd_even {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("enter the size of the array : ");
	int size=scan.nextInt();
	System.out.println("enter the elements of array :");
	int[] arr=new int[size];
	for(int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
	}
	odd_even_sum(arr);
	scan.close();
}
public static void odd_even_sum(int[] arr) {
	int oddsum=0;
	int evensum=0;
	for(int i=0;i<arr.length;i++) {
		if(i%2!=0) {
		oddsum+=arr[i];	
		}else {
		evensum+=arr[i];	
		}
	}
	System.out.println("odd  index sum : "+oddsum);
	System.out.println("even index sum : "+evensum);
}
}
