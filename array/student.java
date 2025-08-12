package array;

public class student {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 6, 5 }, { 9, 6, 8 } };
		print(a);
		System.out.println();
		printForEach(a);
	}

	public static void print(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void printForEach(int[][] a) {
		for (int b[] : a) {
			for (int c : b) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}
}
