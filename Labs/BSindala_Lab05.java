// Boniface Sindala
// CIS 255 (Fall 2013)
// Laboratory Assignment 5
// September 25th, 2013
// In this assignment,I will work with Java file input and output syntax
// to generate lists of hot days and cold nights in a given month.

import java.util.Scanner; // Needed for the Scanner class
import javax.swing.JOptionPane; // Needed for the dialog display
import java.io.*; // Needed for the file and IOException

public class BSindala_Lab05
{
	public static void main(String[] args) throws IOException
	{
		int day, highTemp, lowTemp;

		File tFile = new File("MonthTemps.txt"); // Opening of the File Input

		// Checking for file existence
		if (!tFile.exists())
		{
			JOptionPane.showMessageDialog(null, "The file " + tFile + "does not exist!");
			System.exit(0);
		}

		Scanner inputFile = new Scanner (tFile);

		// Writing to the new files using the PrintWriter class
		PrintWriter outputFileHot = new PrintWriter("HotDays.txt");
		PrintWriter outputFileCold = new PrintWriter("ColdNights.txt");

		// Putting a header on the output files
		outputFileHot.println("Day \tHigh \tLow");
		outputFileCold.println("Day \tHigh \tLow");

		// Loop for copying the files and decision statements for high and low temperatures
		while (inputFile.hasNext())
		{
			day = inputFile.nextInt();
			highTemp = inputFile.nextInt();
			lowTemp = inputFile.nextInt();
			if (highTemp >= 80)
			{
				outputFileHot.print(day + "\t");
				outputFileHot.print(highTemp + "\t");
				outputFileHot.println(lowTemp);
			}
			if (lowTemp <= 30)
			{
				outputFileCold.print(day + "\t");
				outputFileCold.print(highTemp + "\t");
				outputFileCold.println(lowTemp);
			}
		}

		// Closing of all files
		inputFile.close();
		outputFileHot.close();
		outputFileCold.close();
		System.out.println("\nThe high and low temperatures have been written to their"
							+ " respective files!\n");
	}
}