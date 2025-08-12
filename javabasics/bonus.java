package javabasics;

import java.util.Scanner;

public class bonus {
	public static void main(String[] args) { // assignment question no 9
		salary();
	}

	public static void salary() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the basic salary:");
		double basic_sal = scan.nextDouble();
		System.out.println("enter the year of join:");
		int year_join = scan.nextInt();
		System.out.println("current year:");
		int year_current = scan.nextInt();
		scan.close();
		int year = year_current - year_join;
		System.out.println("Gross salary:");
		if (basic_sal <= 10000) {
			if (year > 3) {
				System.out.println(basic_sal + 0.2 * basic_sal + 0.8 * basic_sal + 2500);
			} else if (year < 3) {
				System.out.println(basic_sal + 0.2 * basic_sal + 0.8 * basic_sal);
			}

		} else if (basic_sal > 10000 && basic_sal <= 20000) {
			if (year > 3) {
				System.out.println(basic_sal + 0.25 * basic_sal + 0.9 * basic_sal + 2500);
			} else if (year < 3) {
				System.out.println(basic_sal + 0.25 * basic_sal + 0.9 * basic_sal);
			}

		} else if (basic_sal > 20000) {
			if (year > 3) {
				System.out.println(basic_sal + 0.3 * basic_sal + 0.95 * basic_sal + 2500);
			} else if (year < 3) {
				System.out.println(basic_sal + 0.3 * basic_sal + 0.95 * basic_sal);
			} else {
				System.out.println("enter valid input");
			}
		}
	}

}
