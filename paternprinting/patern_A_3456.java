package paternprinting;

public class patern_A_3456 {
	public static void main(String[] args) {
		int num = 5;
		char ch = 'A';
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				if (row == col) {
					System.out.print(ch + " ");
					ch++;
				} else {
					System.out.print(col + 2 + " ");
				}
			}
			System.out.println();
		}
	}
}
