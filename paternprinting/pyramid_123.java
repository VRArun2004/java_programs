package paternprinting;


public class pyramid_123 {
	public static void main(String[] args) {

		int num = 3;
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num * 2 - 1; col++) {
				if (row + col >= num + 1 && col - row <= num - 1) {
					if (row - col == num - 2 || col - row == num - 2) {
						System.out.print(2);
					} else if(col==(num*2)/2){

						System.out.print(row);
					}else {
						System.out.print(1);
					}
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
