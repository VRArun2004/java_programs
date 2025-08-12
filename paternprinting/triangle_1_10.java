package paternprinting;

public class triangle_1_10 {
	public static void main(String[] args) {
		int num = 4;
		int num1 = 1;
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				if (row >= col) {
					System.out.print(num1);
					num1++;
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
