import java.util.Scanner;

public class test_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = s.nextInt();
		}
		s.close();
	}

	public static void sum(int[] a, int[] b, int n) {
		int swap = 0;
		for (; swap < n; swap++) {
			while (swap != 0) {
				for (int i = 1; i < n; i++) {
					int temp = a[0];
					a[0] = a[i];
					a[i] = temp;
				}
			}
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum = sum + (a[i] * b[i]);
			}

		}
	}
}
