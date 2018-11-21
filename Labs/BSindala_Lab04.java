// Boniface Sindala
// CIS 255 (Fall 2013)
// Laboratory Assignment 4
// September 25th, 2013
// In this assignment, I will work with a Java Loop structure
// to allow the user to determine how much a family will have to spend
// on vacation after saving money for twelve months.
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class BSindala_Lab04
{
	public static void main(String[] args)
	{
		// Variable declarations
		int mCounter = 1;
		double mSaving, totalSaved = 0.00;
		String dInput;

		// Input from for loop
		for (mCounter = 1; mCounter <= 12; mCounter++)
		{
			dInput = JOptionPane.showInputDialog("Enter the amount you are"
										+ " able to save during month #" + mCounter + " in dollars($):");
			mSaving = Double.parseDouble(dInput);
			totalSaved += mSaving;
		}

		// Display for the total
		DecimalFormat formatter = new DecimalFormat("#,##0.00");
		JOptionPane.showMessageDialog(null, "Based on the monthly savings amounts, " +
											"you have saved $" + formatter.format(totalSaved) +
											" to spend on your vacation next year.");

		// Decision structure for the savings
		if (totalSaved >= 1000)
		{
			JOptionPane.showMessageDialog(null, "That's a nice chunk!");
		}
		else if (totalSaved <= 100)
		{
			JOptionPane.showMessageDialog(null, "Maybe you should keep saving another year.");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "I hope you enjoy your vacation!");
		}

		System.exit(0);
	}
}