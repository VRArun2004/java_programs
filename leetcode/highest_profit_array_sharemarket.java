package leetcode;

import java.util.Arrays;

public class highest_profit_array_sharemarket {
	public static void main(String[] args) {

		int[] a = { 7, 1, 5, 3, 6, 4 };
		int profit = 0;
System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] - a[i] > profit) {
					profit = a[j] - a[i];
				}
			}
		}
		System.out.println("highest profit: "+profit);
	}
}
