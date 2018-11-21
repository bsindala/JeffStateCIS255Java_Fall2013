// Boniface Sindala
// CIS 255 (Fall 2013)
// Laboratory Assignment 2
// September 2nd, 2013
// In this assignment, I will work with Java decision structures
// to determine the new balance in a savings account after one month
// based on the amount of principal and age of the account holder.

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class BSindala_Lab03
{
	public static void main(String[] args)
	{
		double initialBalance, monthlyInterest = 0.00, newBalance, accountMaintenance = 0.50;
		double interest1 = 0.0075; // Interest for $100.00 to $2,499.99
		double interest2 = 0.0085; // Interest for $2,500.00 to $24,999.99
		double interest3 = 0.01;   // Interest for $25,000.00 to $99,999.99
		double interest4 = 0.0125; // Interest for $100,000.00 and above
		int age;
		String input;

		// Get input using a dialog box
		input = JOptionPane.showInputDialog("What is the account's initial balance:");
		initialBalance = Double.parseDouble(input);
		input = JOptionPane.showInputDialog("What is the account holder's age in years:");
		age = Integer.parseInt(input);

		// Perform interest and new balance calculations
		if (initialBalance < 100)
		{
			newBalance = initialBalance;
		}
		else if (initialBalance >= 100.00 && initialBalance <= 2499.99)
		{
			monthlyInterest = initialBalance * interest1 / 12;
			newBalance = initialBalance + monthlyInterest;
		}
		else if (initialBalance >= 2500.00 && initialBalance <= 24999.99)
		{
			monthlyInterest = initialBalance * interest2 / 12;
			newBalance = initialBalance + monthlyInterest;
		}
		else if (initialBalance >=25000.00 && initialBalance <= 99999.99)
		{
			monthlyInterest = initialBalance * interest3 / 12;
			newBalance = initialBalance + monthlyInterest;
		}
		else
		{
			monthlyInterest = initialBalance * interest4 / 12;
			newBalance = initialBalance + monthlyInterest;
		}

		// Format and display the output
		DecimalFormat formatter = new DecimalFormat("#,##0.00");
		if (age < 18 || age > 65)
		{
			JOptionPane.showMessageDialog(null, "Initial Balance: $" + formatter.format(initialBalance) +
												"\nInterest Accrued: $" + formatter.format(monthlyInterest) +
												"\nNew Balance: $" + formatter.format(newBalance));
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Initial Balance: $" + formatter.format(initialBalance) +
												"\nInterest Accrued: $" + formatter.format(monthlyInterest) +
												"\nAccount Maintenance: $" + formatter.format(accountMaintenance) +
												"\nNew Balance: $" + formatter.format(newBalance - accountMaintenance));
		}

		System.exit(0);
	}
}