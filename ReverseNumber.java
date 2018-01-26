/**
Problem :-
				Given a number N, print reverse of number N.
Note: Do not print leading zeros in output.
For example N = 100
Reverse of N will be 1 not 001.

*/



import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseNumber {

	static Scanner in = new Scanner(System.in);

	public static void reverse() {

		try {
				int input, reverse = 0, remainder;
				System.out.println("Please enter the number to reverse");

				input = in.nextInt();

				while (input > 0) {

					remainder = input % 10;;
					reverse = reverse * 10 + remainder;
					input = input / 10;

			}

			System.out.println("The reversed number is " + Math.round(reverse));

		} catch (InputMismatchException e) {

			System.out.println("Enter the integer only");
			reverse();

		}

	}

	public static void main(String args[])

	{
		reverse();
	}

}
