package assign8;

import java.util.Scanner;

public class RecursiveFunctions {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int number;
			System.out.println("1 : Sum of Digits");
			System.out.println("2 : Sqaure of the number");
			System.out.println("3 : Factorial of the number");
			System.out.println("4 : Number is Pallindrome or not?");
			System.out.println("Enter your choice");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter the number for finding sum of the digits in number (recursively)");
				number = sumOfDigits(sc.nextInt());
				System.out.println("sum of digits in number is " + number);
				break;
			case 2:
				System.out.println("Enter the number for finding square of the number (recursively)");
				number = square(2, sc.nextInt());
				System.out.println("Square of is: " + number);
				break;
			case 3:
				System.out.println("Enter the number for finding factorial of the number (tail recursively)");
				number = factorial(1, sc.nextInt());
				System.out.println("Factorial of number is: " + number);
				break;
			case 4:
				System.out.println("Enter the number for checking number is pallindrome or not (recursively)");
				number = sc.nextInt();
				if (number == pallindrome(0, number))
					System.out.println("Number is pallindrome");
				else
					System.out.println("Numnber is not pallindrome");
				break;
			}

		}
	}

	private static int pallindrome(int rev, int number) {
		if (number == 0)
			return rev;
		else
			return pallindrome(rev * 10 + number % 10, number / 10);
	}

	private static int factorial(int acc, int number) {
		if (number == 1)
			return acc;
		else
			return factorial(acc * number, --number);
	}

	private static int square(int cnt, int number) {
		if (cnt == 1)
			return number;
		else
			return number * square(--cnt, number);

	}

	private static int sumOfDigits(int number) {
		if (number == 0)
			return 0;
		else
			return number % 10 + sumOfDigits(number / 10);

	}

}
