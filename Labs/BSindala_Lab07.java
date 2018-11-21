/** Boniface Sindala
	CIS 255 (Fall 2013)
	Laboratory Assignment 7
	October 4, 2013
	In this assignment, I will work with Java method syntax to calculate
	the cost of an order of candy bars for a fundraiser. */

import java.util.Scanner; // Needed for the Scanner class

public class BSindala_Lab07
{
	public static void main(String[] args)
	{
		char size;
		int bars;
		double total;
		String input;
		Scanner keyboard = new Scanner(System.in);

		barSize(); // Calling on barSize method for choosing the size of chocolate bars

		// Input for the bar size and quantity
		System.out.print("Enter your selection now: ");
		input = keyboard.nextLine();
		size = input.charAt(0);
		System.out.print("How many candy bars would you like? ");
		bars = keyboard.nextInt();

		total = totalAmount(size, bars); // Intializing total with the totalAmount method
		System.out.printf("Your order total comes to $%.2f\n", total);
		System.out.println("Please make your check payable to the school.  Thanks again!");
	}

	/** barSize method for selecting the chocolate bar size */
	public static void barSize()
	{
		System.out.println("Thank you for supporting our school!");
		System.out.println("Please choose a candy bar size:");
		System.out.println("S = Small\n" +
						   "M = Medium\n" +
						   "L = Large.");
	}

	/** totalAmount method for calculating the total amount with
		@param barSize 		the size of bar that generates the amount of the bar,
		@param barQuantity 	the number of bars to be multiplied by the amount of the one bar size, and
		@return orderAmount the total after the multiplication of the barSize and barQuantity */
	public static double totalAmount(char barSize, int barQuantity)
	{
		double orderAmount = 0, small = 2.50, medium = 3.75, large = 5.00; // Declarations of amounts according to size

		if ((barSize == 'S') || (barSize == 's'))
			orderAmount = small * barQuantity;
		else if ((barSize == 'M') || (barSize == 'm'))
			orderAmount = medium * barQuantity;
		else if ((barSize == 'L') || (barSize == 'l'))
			orderAmount = large * barQuantity;
		return orderAmount; // Returning of the total order
	}
}