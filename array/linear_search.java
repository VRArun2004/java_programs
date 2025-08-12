package array;

import java.util.Scanner;

public class linear_search {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length: ");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("enter  the elements");
		for (int i = 0; i < size; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("enter the element to search:");
		int elem = scan.nextInt();
		scan.close();
		int res = linear(a, elem);
		System.out.println("index number of the element:" + res);
	}

	public static int linear(int[] a, int elem) {
		int result = -1;
		for (int i = 0; i < a.length; i++) {
			if (elem == a[i]) {
				result = i;
				break;
			}
		}
		return result;
	}
}
