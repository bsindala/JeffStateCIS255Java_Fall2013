// Boniface Sindala
// CIS 255 (Fall 2013)
// Laboratory Assignment 9
// October 20, 2013
// In this assignment, I will work with Java class syntax to
// track the number of various items ordered from a warehouse.
import javax.swing.JOptionPane;

public class Orders
{
	private int chairs;
	private int tables;
	private int beds;

	// No argument constructor for default orders
	public Orders()
	{
		chairs = 0;
		tables = 0;
		beds = 0;
	}

	// Constructor with 3 arguments for initial orders
	public Orders(int c, int t, int b)
	{
		if (c >= 0) // 0 is technically non negative nor positive
		{
			chairs = c;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Error! Number of chairs ordered can not be negative.");
			chairs = 0;
		}

		if (t >= 0) // 0 is technically non negative nor positive
		{
			tables = t;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Error! Number of tables ordered can not be negative.");
			tables = 0;
		}

		if (b >= 0) // 0 is technically non negative nor positive
		{
			beds = b;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Error! Number of beds ordered can not be negative.");
			beds = 0;
		}

	}

	// Module for ordered chairs
	public void orderChairs(int c)
	{
		int newChairs = c;
		if (newChairs >= 0) // 0 is technically non negative nor positive
		{
			chairs = chairs + newChairs;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Error! Number for chairs can not be negative.");
		}
	}

	// Module for ordered tables
	public void orderTables(int t)
	{
		int newTables =  t;
		if (newTables >= 0) // 0 is technically non negative nor positive
		{
			tables = tables + newTables;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Error! Number for tables can not be negative.");
		}

	}

	// Module for ordered beds
	public void orderBeds(int b)
	{
		int newBeds = b;
		if (newBeds >= 0) // 0 is technically non negative nor positive
		{
			beds = beds + newBeds;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Error! Number for chairs can not be negative.");
		}

	}

	// Module for cancelled ordered chairs
	public void cancelChairs(int c)
	{
		int cancelledChairs = c;
		if ((cancelledChairs > 0) && (cancelledChairs <= chairs)) // Cancelled orders should be less than zero to be rejected
		{
			chairs = chairs - cancelledChairs;
		}
		else if (cancelledChairs < 0)
		{
			JOptionPane.showMessageDialog(null, "Error! Number for chairs can not be negative.");
		}
		else if (cancelledChairs > chairs)
		{
			JOptionPane.showMessageDialog(null, "Error! Number to cancel can not be greater than number ordered.");
		}
	}

	// Module for cancelled table orders
	public void cancelTables(int t)
	{
		int cancelledTables = t;
		if ((cancelledTables > 0) && (cancelledTables <= tables)) // Cancelled orders should be less than zero to be rejected
		{
			tables = tables - cancelledTables;
		}
		else if (cancelledTables > tables)
		{
			JOptionPane.showMessageDialog(null, "Error! Number for tables can not be negative.");
		}
		else if (cancelledTables > tables)
		{
			JOptionPane.showMessageDialog(null, "Error! Number to cancel can not be greater than number ordered.");
		}
	}

	// Module for cancelled bed orders
	public void cancelBeds(int b)
	{
		int cancelledBeds = b;
		if ((cancelledBeds > 0) && (cancelledBeds <= beds)) // Cancelled orders should be less than zero to be rejected
		{
			beds = beds - cancelledBeds;
		}
		else if (cancelledBeds < 0)
		{
			JOptionPane.showMessageDialog(null, "Error! Number for chairs can not be negative.");
		}
		else if (cancelledBeds > beds)
		{
			JOptionPane.showMessageDialog(null, "Error! Number to cancel can not be greater than number ordered.");
		}
	}

	// Output module
	public void displayOrders()
	{
		JOptionPane.showMessageDialog(null, "Furniture orders so far:" +
									"\nChairs: " + chairs +
									"\nTables: " + tables +
									"\nBeds:   " + beds);
	}
}