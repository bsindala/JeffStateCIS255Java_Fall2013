// Boniface Sindala
// CIS 255 (Fall 2013)
// Laboratory Assignment 2
// September 2nd, 2013
// In this assignment, I will deal with numeric quantities, the number of players available in a soccer league,
// the number of teams in which to divide the players, the number of players to be played on each team,
// and the number of players left over.

import java.util.Scanner;

public class BSindala_Lab02
{
	public static void main(String[] args)
	{
		int totalNumberOfPlayers, numberOfTeams, playersPerTeam, playersLeftOver;
		Scanner keyboard = new Scanner(System.in); // Creat a scanner object to read input.

		// Requesting input on the console.
		System.out.print("Please enter the total number of players available for this soccer league: ");
		totalNumberOfPlayers = keyboard.nextInt();
		System.out.print("Please enter the total number of teams to play in this soccer league: ");
		numberOfTeams = keyboard.nextInt();

		// Arithmetic calculations for the Players per team and the players left over.
		playersPerTeam = totalNumberOfPlayers / numberOfTeams;
		playersLeftOver = totalNumberOfPlayers % numberOfTeams;

		// Display the arithmetic results.
		System.out.println("The total number of players is " + totalNumberOfPlayers +
						" divided among " + numberOfTeams + " teams.");
		System.out.println("Each team will have " + playersPerTeam + " players with " + playersLeftOver + " player(s) left over.\n");
	}
}
