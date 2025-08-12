package paternprinting;

public class triangle_A_J {
	public static void main(String[] args) {
		int num = 4;
		char ch = 'A';
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				if (row >= col) {
					System.out.print(ch);
					ch++;
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
