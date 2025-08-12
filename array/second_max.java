package array;

public class second_max {
	public static void main(String[] args) {
		int[] a = { 20, 7, 15, 13, 13, 15, 14 };

		System.out.println(" The second maximum: " + sec_max(a));
	}

	public static int sec_max(int[] a) {
		int max1 = a[0];
		int max2 = a[1];
		for (int i = 1; i < a.length; i++) {
			if (max1 < a[i]) {
				max2 = max1;
				max1 = a[i];
			} else if (max2 < a[i] && max1 != a[i]) {
				max2 = a[i];
			}

		}
		return max2;
	}
}
