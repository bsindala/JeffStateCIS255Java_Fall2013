// Boniface Sindala
// CIS 255 (Fall 2013)
// Laboratory Assignment 9
// October 20, 2013
// In this assignment, I will work with Java class syntax to
// track the number of various items ordered from a warehouse.

import javax.swing.JOptionPane;

public class BSindala_Lab09
{
	public static void main(String[] args)
	{
		String orderInput;
		int orderChair, orderTable, orderBed, chair,
						cancelledChairs, table, cancelledTables, bed, cancelledBeds;

		// Input for initial orders for the furniture
		orderInput = JOptionPane.showInputDialog("Enter the initial order for chairs: ");
		chair = Integer.parseInt(orderInput);

		orderInput = JOptionPane.showInputDialog("Enter the initial order for tables: ");
		table = Integer.parseInt(orderInput);

		orderInput = JOptionPane.showInputDialog("Enter the initial order for beds: ");
		bed = Integer.parseInt(orderInput);

		Orders itemOrder2 = new Orders(chair, table, bed);

		// Calculation for new and cancelled orders for chairs
		orderInput = JOptionPane.showInputDialog("Enter the new order for chairs: ");
		orderChair = Integer.parseInt(orderInput);
		itemOrder2.orderChairs(orderChair);
		orderInput = JOptionPane.showInputDialog("Enter the number of orders to be cancelled for chairs: ");
		cancelledChairs = Integer.parseInt(orderInput);
		itemOrder2.cancelChairs(cancelledChairs);

		// Calculation for new and cancelled orders for tables
		orderInput = JOptionPane.showInputDialog("Enter the new order for tables: ");
		orderTable = Integer.parseInt(orderInput);
		itemOrder2.orderTables(orderTable);
		orderInput = JOptionPane.showInputDialog("Enter the number of orders to be cancelled for tables: ");
		cancelledTables = Integer.parseInt(orderInput);
		itemOrder2.cancelTables(cancelledTables);

		// Calculation for new and cancelled orders for beds
		orderInput = JOptionPane.showInputDialog("Enter the new order for beds: ");
		orderBed = Integer.parseInt(orderInput);
		itemOrder2.orderBeds(orderBed);
		orderInput = JOptionPane.showInputDialog("Enter the number of orders to be cancelled for beds: ");
		cancelledBeds = Integer.parseInt(orderInput);
		itemOrder2.cancelBeds(cancelledBeds);

		itemOrder2.displayOrders(); // Output module
	}
}
