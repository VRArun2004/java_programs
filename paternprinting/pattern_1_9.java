package paternprinting;

public class pattern_1_9 {
	public static void main(String[] args) {
		int num = 3;
		int num1 = 1;
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				System.out.print(num1);
				num1++;
			}
			System.out.println();
		}
	}
}
