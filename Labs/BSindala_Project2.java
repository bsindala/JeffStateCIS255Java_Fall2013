// Boniface Sindala
// CIS 255 (Fall 2013)
// Project 2
// November 21, 2013
// In this project, I write a program that calculates the
// period of time it will take to payoff the loan.

import java.util.Scanner; // Needed for Scanner class

public class BSindala_Project2
{
	public static void main(String[] args)
	{
		double principal, miniInterest, maxInterest;
		int timeMonths;
		char repeat;
		String input;
		Scanner keyboard = new Scanner(System.in);

		// Do while loop for the user input
		do
		{
			System.out.print("How much do you plan to borrow? ");
			principal = keyboard.nextDouble();
			System.out.print("How long with the loan term be (in months)? ");
			timeMonths = keyboard.nextInt();
			System.out.print("Enter a minimum annual interest rate: ");
			miniInterest = keyboard.nextDouble() / 100;
			System.out.print("Enter a maximum annual interest rate: ");
			maxInterest = keyboard.nextDouble() / 100;

			// Calling of the monthlyPayment method that does the calculation
			monthlyPayment(principal, timeMonths, miniInterest, maxInterest);

			System.out.print("\nWould you like another table calculation? (Y/N) ");
			input = keyboard.next();
			repeat = input.charAt(0);
			System.out.println(); // Needed for a new line to make output look neat
		}while (repeat == 'Y' || repeat == 'y');

		System.out.println("Thank you for using this loan payment calculator!");
		System.exit(0);
	}

	// monthlyPayment method for the calculatio of the payment
	public static double monthlyPayment(double princ, int time, double mini, double max)
	{
		double payment = 0.00;

		// Table heading
		System.out.println("\nRate\tPayment");
		System.out.println("----\t-------");

		// Payment calculation and loop to display the table
		for (double i = mini; i <= max; i += 0.0025)
		{
			payment = princ * (i + (i / ((Math.pow((1 + i), time)) - 1)));
			System.out.printf("%.2f%%\t%.2f\n", (i * 100), payment);
		}

		return payment;
	}
}
