/** Boniface Sindala
	CIS 255 (Fall 2013)
	Laboratory Assignment 6
	October 3, 2013
	In this assignment, I will work with a single void method
	with a parament to display one of at least 3 state nicknames */

import java.util.Scanner; // Needed for Scanner class

public class BSindala_Lab06
{
	public static void main(String[] args)
	{
		int selectState;
		Scanner select = new Scanner(System.in);

		chooseState(); // Calling method chooseState
		selectState = select.nextInt(); // Scanner input
		stateNickname(selectState); // Calling method stateNickname
	}

	/** chooseState method for the selection of the state for the nickname */
	public static void chooseState()
	{
		System.out.println("Please choose from the following states:");
		System.out.println("1. Alabama.");
		System.out.println("2. Florida.");
		System.out.println("3. Georgia.");
		System.out.println("4. Kentucky.");
		System.out.println("5. Tennessee.");
		System.out.print("Enter your number of choice: ");
	}

	/** stateNickname method returning a nickname using
		@param menu 	the state of choice whose nickname will be displayed. */
	public static void stateNickname(int menu)
	{
		String nickname = " ", statename = " "; // Initialized string variables for the nickname and statename respectively

		if (menu == 1)
		{
			nickname = "The Yellowhammer State.";
			statename = "Alabama";
		}
		else if (menu == 2)
		{
			nickname = "The Sunshine State.";
			statename = "Florida";
		}
		else if (menu == 3)
		{
			nickname = "The Peach State.";
			statename = "Georgia";
		}
		else if (menu == 4)
		{
			nickname = "The Bluegrass State.";
			statename = "Kentucky";
		}
		else if (menu == 5)
		{
			nickname = "The Volunteer State.";
			statename = "Tennessee";
		}
		else
		{
			System.out.println("\nThe choice you selected is not a valid choice!");
			System.exit(0);
		}
		System.out.println("\nThe nickname for " + statename + " is " + nickname);
		System.exit(0);
	}
}