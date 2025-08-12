package phase2;

import java.util.Scanner;

public class even_index_even_element {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size=scan.nextInt();
		int []a=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		scan.close();
		System.out.println(evenindexandelement(a));
	}
	public static double evenindexandelement(int[] a) {
		double add=0;
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				if(a[i]%2==0) {
				add=add+a[i];
				count++;
				}
			}
		}
		System.out.println("even index even element");
		return add/count;
	}
}
