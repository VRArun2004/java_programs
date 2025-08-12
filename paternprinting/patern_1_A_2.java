package paternprinting;

public class patern_1_A_2 {
	public static void main(String[] args) {
		int num = 3;
		int num1 = 1;
		char ch = 'A';
		for (int row = 1; row <= num; row++) {
			if (row == 3) {
				num1++;
			}
			for (int col = 1; col <= num; col++) {
				if (row != 2) {
					System.out.print(num1);
				} else {
					System.out.print(ch);
				}
			}
			System.out.println();
		}

	}
}
