package javabasics;

import java.util.Scanner;
public class upper_case {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an alphabet: ");
        char ch = scan.next().charAt(0);
        scan.close();

        if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is an uppercase alphabet.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is a lowercase alphabet.");
        } else {
            System.out.println("Invalid input. Please enter an alphabet.");
        }
	}
}
