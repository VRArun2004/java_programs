package array;

import java.util.Scanner;

public class freq_count_particular_array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length oif array: ");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("enter the elements of array:");
		for (int i = 0; i < size; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("enter the key: ");
		int key = scan.nextInt();
		scan.close();
		int res = freq(a, key);
		System.out.println(key + " 's frequency is: " + res);
		System.out.println("key value removed array");
		print(removekey(a, key));

	}

	public static int freq(int[] a, int key) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (key == a[i]) {
				count++;
			}
		}
		return count;
	}

	public static int[] removekey(int[] a, int key) {
		int count = freq(a, key);
		int[] b = new int[a.length - count];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != key) {
				b[k] = a[i];
				k++;
			}
		}
		return b;
	}

	public static void print(int[] b) {
		for (int i : b) {
			System.out.print(i + " ");
		}
	}
}
