package paternprinting;

public class patern_ABC {
	public static void main(String[] args) {
		int num = 3;
		char ch = 'A';
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}

	}

}
