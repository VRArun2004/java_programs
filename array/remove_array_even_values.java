package array;

import java.util.Scanner;

public class remove_array_even_values {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of array: ");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("enter the elements of array:");
		for (int i = 0; i < size; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
int count=0;
for(int i=0;i<a.length;i++) {
	if(a[i]%2==0) {
		count++;
	}
}
int[] b=new int[a.length-count];
int i=0;
	for(int j=0;j<a.length;j++) {
		if(a[j]%2!=0) {
			b[i]=a[j];
			i++;
		
	}
}
System.out.println("original array:");
print(a);
System.out.println();
System.out.println("new array:");
print(b);
	}

	
	public static void print(int[] b) {
		for (int i : b) {
			System.out.print(i + " ");
		}
	}

}
