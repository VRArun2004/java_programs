package phase2;

import java.util.*;

public class left_shift {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int shift = scan.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		shift(a, shift);
		System.out.println(Arrays.toString(a));
	}

	public static void shift(int[] a, int shift) {
		for (int j = 1; j <= shift; j++) {
			int n = a.length - 1;
			int first = a[0];
			for (int i = 0; i < n; i++) {
				a[i] = a[i + 1];
			}
			a[n] = first;
		}
		for (int i = 0; i < shift; i++) {
			a[i] = 0;
		}
	}
}
