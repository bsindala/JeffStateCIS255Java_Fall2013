// Boniface Sindala
// CIS 255 (Fall 2013)
// Laboratory Assignment 10
// November 1, 2013
// In this assignment, I will work with Java array syntax
// to read in a location's high temperature and low temperature for
// a month and display these values in columns with the average between then two.

import java.util.Scanner;

public class BSindala_Lab10
{
	public static void main(String[] args)
	{
		final int MONTHS = 12;
		double[] high = new double[MONTHS]; // Array for highest temperature
		double[] low = new double[MONTHS]; // Array for lowest temperature
		double[] average = new double[MONTHS]; // Array for average temperature
		int index = 0;
		Scanner keyboard = new Scanner(System.in);

		// For loop for temperature input both high and low
		for (index = 0; index < MONTHS; index++)
		{
			System.out.print("Enter the highest temperature for month #" + (index + 1) + ": ");
			high[index] = keyboard.nextDouble();
			System.out.print("Enter the lowest temperature for month #" + (index + 1) + ": ");
			low[index] = keyboard.nextDouble();
			average[index] = (high[index] + low[index])/2;
		}

		// Heading
		System.out.println("\nMonth \tHigh \tLow \tAverage");
		System.out.println("_____ \t_____ \t_____ \t_____");

		// Loop for output with printf format
		for (index = 0; index < MONTHS; index++)
		{
			System.out.printf((index + 1)  + "\t%.1f\t%.1f\t%.1f\n", high[index], low[index], average[index]);
		}
	}
}