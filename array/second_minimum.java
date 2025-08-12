package array;

public class second_minimum {
	public static void main(String[] args) {
		int[] a = { 9,10,3,20,4,12};

		System.out.println(" The second minimum: " + sec_min(a));
	}

	public static int sec_min(int[] a) {
		int min1 = a[0];
		int min2 = a[1];
		for (int i = 1; i < a.length; i++) {
			if (min1 > a[i]) {
				min2 = min1;
				min1 = a[i];
			} else if (min2 > a[i] && min1 != a[i]) {
				min2 = a[i];
			}

		}
		return min2;
	}
}
