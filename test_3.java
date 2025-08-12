import java.util.Arrays;

public class test_3 {
	public static void main(String[] args) {
		int[] a = { 3, 0, 1, 5, 6, 0, 3, 9, 0, 0 };
		move_zero_to_right(a);
	}

	public static void move_zero_to_right(int[] a) {
		
		int[] b = new int[a.length];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				b[k] = a[i];
				k++;
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
