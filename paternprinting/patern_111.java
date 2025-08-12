package paternprinting;

public class patern_111 {
	public static void main(String[] args) {
		int num = 3;
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				System.out.print(row);
			}
			System.out.println();
		}

	}
}