package phase2;

import java.util.Arrays;

public class assign_1 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6};
		System.out.println("before shift");
		System.out.println(Arrays.toString(a));
		shift(a);
		System.out.println("after shift");
		System.out.println(Arrays.toString(a));
	}
	public static void shift(int[] a) {

			int n = (a.length - 1)/2;
			int last = a[n];
			for (int i = n; i > 0; i--) {
				a[i] = a[i - 1];
			}
			a[0] = last;
			int m = a.length - 1;
			int last1 = a[m];
			for (int i = m; i >n+1; i--) {
				a[i] = a[i - 1];
			}
			a[n+1] = last1;
	}
}
