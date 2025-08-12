package array;

public class even_num_array {
	public static void main(String[] args) {
		int[] a = { 10, 21, 30, 43, 50, 60, 7, 80 };
		even(a);
	}

	public static void even(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}

	}
}