package javabasics;

import java.util.Scanner;

public class final_price {
	public static void main(String[] args) {
		price();
	}

	public static void price() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the price:");
		double price = scan.nextDouble();
		scan.close();
		System.out.println("total price: " + price);
		System.out.println("total price with discount:");
		if (price > 1000 && price < 3000) {
			System.out.println(price - (0.1 * price));
		} else if (price >= 3000 && price < 6000) {
			System.out.println(price - (0.2 * price));
		} else if (price >= 6000) {
			System.out.println(price - (0.4 * price));
		} else if (price < 1000) {
			System.out.println(price);
		}
	}
}
