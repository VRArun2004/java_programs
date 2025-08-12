package phase2;

import java.util.*;

public class right_shift {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int s = scan.nextInt();
		System.out.println("before shift");
		System.out.println(Arrays.toString(a));
		shift(a, s);
		System.out.println("after shift");
		System.out.println(Arrays.toString(a));
		scan.close();
	}

	public static void shift(int[] a,int s) {
		for (int j = 1; j <= s; j++) {
			int n = a.length - 1;
			int last = a[n];
			for (int i = n; i > 0; i--) {
				a[i] = a[i - 1];
			}
			a[0] = last;
		}
		for(int i=0;i<s;i++) {
			a[i]=0;
		}
	}
}
