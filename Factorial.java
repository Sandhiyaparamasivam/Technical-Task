package com.codoid;

import java.util.Scanner;

class Factorial {
	private static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner scan = new Scanner(System.in);
	     int number= scan.nextInt();
	     scan.close();
	     int fact = factorial(number);
	     System.out.println("Factorial of " + number + " is: "+ fact);
	}
}
