package array;

public class count_prime {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
		System.out.println("the number of primenumbers in the array is :" + prime_number(a));
		;
	}

	public static int prime_number(int[] a) {
		int res = 0;
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 1; j <= a[i]; j++) {
				if (a[i] % j == 0)
					count++;
			}
			if (count == 2)
				res++;
		}

		return res;
	}
}
