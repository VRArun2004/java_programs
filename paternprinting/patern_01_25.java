package paternprinting;

public class patern_01_25 {
	public static void main(String[] args) {
		int num = 5;
		int num1 = 1;
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				if (num1 <= 9) {
					System.out.print("0" + num1 + " ");
				} else {
					System.out.print(num1 + " ");
				}
				num1++;
			}
			System.out.println();
		}

	}

}
