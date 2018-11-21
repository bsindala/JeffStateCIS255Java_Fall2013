// Boniface Sindala
// CIS 255 (Fall 2013)
// Project 1
// November 13, 2013
// In this project, I write a program that sorts orders according to the city zip codes

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;

public class BSindala_Project1
{
	public static void main(String[] args) throws IOException
	{
		int zipCode;
		double preTotal;

		// Declarations for arithmetic calculations
		double salesTax = 0.00, total = 0.00, preSumA = 0.00, taxSumA = 0.00, totalSumA = 0.00,
											preSumF = 0.00, taxSumF = 0.00, totalSumF = 0.00,
											preSumI = 0.00, taxSumI = 0.00, totalSumI = 0.00,
											preSumR = 0.00, taxSumR = 0.00, totalSumR = 0.00;

		File orderFile = new File("webOrders.txt"); // Opening the webOrders.txt file

		// Checking for the files existence
		if (!orderFile.exists())
		{
			JOptionPane.showMessageDialog(null, "The file " + orderFile + " was not found!");
			System.exit(0);
		}

		Scanner inputFile = new Scanner(orderFile);

		// Creating output files for the respective cities
		PrintWriter outputAdamsdale = new PrintWriter("adamsdale.txt");
		PrintWriter outputFairview = new PrintWriter("fairview.txt");
		PrintWriter outputIronton = new PrintWriter("ironton.txt");
		PrintWriter outputRoly = new PrintWriter("rolycity.txt");
		PrintWriter outputError = new PrintWriter("cityError.txt");

		// Sorting the orders into their respective city files and formatting the output using printf
		while (inputFile.hasNext())
		{
			zipCode = inputFile.nextInt();
			preTotal = inputFile.nextDouble();
			if (zipCode == 31591)
			{
				salesTax = preTotal * 0.07;
				total = preTotal + (preTotal * 0.07);
				outputAdamsdale.printf("%6.2f %5.2f %7.2f", preTotal, salesTax, total);
				outputAdamsdale.println();
				preSumA = preSumA + preTotal;
				taxSumA = taxSumA + salesTax;
				totalSumA = totalSumA + total;
			}
			if (zipCode == 31594)
			{
				salesTax = preTotal * 0.1;
				total = preTotal + (preTotal * 0.1);
				outputFairview.printf("%6.2f %5.2f %7.2f", preTotal, salesTax, total);
				outputFairview.println();
				preSumF = preSumF + preTotal;
				taxSumF = taxSumF + salesTax;
				totalSumF = totalSumF + total;
			}
			if (zipCode == 31596)
			{
				salesTax = preTotal * 0.09;
				total = preTotal + (preTotal * 0.09);
				outputIronton.printf("%6.2f %5.2f %7.2f", preTotal, salesTax, total);
				outputIronton.println();
				preSumI = preSumI + preTotal;
				taxSumI = taxSumI + salesTax;
				totalSumI = totalSumI + total;
			}
			if (zipCode == 31597)
			{
				salesTax = preTotal * 0.085;
				total = preTotal + (preTotal * 0.085);
				outputRoly.printf("%6.2f %5.2f %7.2f", preTotal, salesTax, total);
				outputRoly.println();
				preSumR = preSumR + preTotal;
				taxSumR = taxSumR + salesTax;
				totalSumR = totalSumR + total;
			}
			if ((zipCode != 31591) && (zipCode != 31594) && (zipCode != 31596) && (zipCode != 31597))
			{
				outputError.print(zipCode + " ");
				outputError.printf("%6.2f", preTotal);
				outputError.println();
			}
		}

		// Summation and formatted output for the respective cities
		outputAdamsdale.printf("%6.2f %5.2f %7.2f", preSumA, taxSumA, totalSumA);
		outputFairview.printf("%6.2f %5.2f %7.2f", preSumF, taxSumF, totalSumF);
		outputIronton.printf("%6.2f %5.2f %7.2f", preSumI, taxSumI, totalSumI);
		outputRoly.printf("%6.2f %5.2f %7.2f", preSumR, taxSumR, totalSumR);

		// Closing the files for the respective cities
		inputFile.close();
		outputAdamsdale.close();
		outputFairview.close();
		outputIronton.close();
		outputRoly.close();
		outputError.close();
		JOptionPane.showMessageDialog(null, "The orders have been sorted according to the city in their respective files.");
	}
}