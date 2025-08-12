package javaproblem;

public class prime_sum {
	public static void main(String[] args) {
		int num = 1;
		int num1 = 30;
		int sum = 0;
		for (; num <= num1; num++) {
			int count = 0;
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				sum = sum + num;
			}
		}
		System.out.println("sum of all prime number between 1 to 30 : " + sum);
	}

}
