package paternprinting;

public class patern_1_A_4 {
	public static void main(String[] args) {
		int num = 3;
		int num1 = 1;
		char ch = 'A';
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				if (row != 2){
					System.out.print(num1);
					num1++;
				}else  {
					System.out.print(ch);
					ch++;
				}
			}
			System.out.println();
		}

	}
}
