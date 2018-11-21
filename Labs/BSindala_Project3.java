// Boniface Sindala
// CIS 255 (Fall 2013)
// Project 3
// December 3, 2013
// In this project, I write a program that uses Java GUI
// to display a flight fare after a few selections.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class BSindala_Project3 extends JFrame
{
	// Creating the components
	private JPanel destinationsPanel;
	private JPanel optionsPanel;
	private JPanel infoPanel;
	private JPanel buttonPanel;
	private JButton fareButton;
	private JLabel fareLabel;

	private JRadioButton atlanta;
	private JRadioButton tennessee;
	private JRadioButton miami;
	private JRadioButton louisville;
	private ButtonGroup bg;

	private JCheckBox firstClass;
	private JCheckBox roundTrip;
	private JTextField bagsTextField;
	private JLabel bagsLabel;

	private JLabel infoLabel;

	private final double ATLANTA = 205.87;
	private final double TENNESSEE = 255.99;
	private final double MIAMI = 301.45;
	private final double LOUISVILLE = 365.00;
	private final double FIRST_CLASS = 200.00;
	private final double BAG = 34.00;
	private final double TAX_RATE = 0.16;

	// Constructor
	public BSindala_Project3()
	{
		// Display a title
		setTitle("AirPath Flights");

		// Action for the close button
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create a BorderLayout manager
		setLayout(new BorderLayout());

		// Custom panels
		infoPanel = new JPanel();
		destinationsPanel = new JPanel();
		optionsPanel = new JPanel();

		buildPanel();

		// Adding the panels
		add(infoPanel, BorderLayout.NORTH);
		add(destinationsPanel, BorderLayout.WEST);
		add(optionsPanel, BorderLayout.EAST);
		add(buttonPanel, BorderLayout.SOUTH);

		pack();
		setVisible(true);
	}

	// getDestinationCost method for the calculation of the destination costs
	public double getDestinationCost()
	{
		double destinationCost = 0.00;

		// Options for the destinations
		if (atlanta.isSelected())
			destinationCost = ATLANTA;
		else if (tennessee.isSelected())
			destinationCost = TENNESSEE;
		else if (miami.isSelected())
			destinationCost = MIAMI;
		else if (louisville.isSelected())
			destinationCost = LOUISVILLE;

		return destinationCost;
	}

	// getOptionsCost method for the calculation of the options to be added to the destination cost
	public double getOptionsCost()
	{
		double optionsCost = 0.00, bags, bagsCost = 0.00;
		String input;

		input = bagsTextField.getText();
				bags = Double.parseDouble(input);

		bagsCost = BAG * bags;

		// Options for the options panel
		if (firstClass.isSelected())
			optionsCost += FIRST_CLASS;
		if (bags > 0)
			optionsCost += bagsCost;
		else
		{
			JOptionPane.showMessageDialog(null, "Error! Number of Checked Bags cannot be Negative.");
			System.exit(0);
		}

		return optionsCost;
	}

	// buildPanel method for the adding of components to the panels
	private void buildPanel()
	{
		buttonPanel = new JPanel();

		//Adding the Components to the panels
		infoLabel = new JLabel("Please Enter the Info for your flight from BHM.");
		infoPanel.add(infoLabel);

		destinationsPanel.setLayout(new GridLayout(4, 1));

		atlanta = new JRadioButton("Atlanta", true);
		tennessee = new JRadioButton("Tennessee");
		miami = new JRadioButton("Miami");
		louisville = new JRadioButton("Louisville");

		bg = new ButtonGroup();
		bg.add(atlanta);
		bg.add(tennessee);
		bg.add(miami);
		bg.add(louisville);

		destinationsPanel.setBorder(BorderFactory.createTitledBorder("Destination"));

		destinationsPanel.add(atlanta);
		destinationsPanel.add(tennessee);
		destinationsPanel.add(miami);
		destinationsPanel.add(louisville);

		optionsPanel.setLayout(new GridLayout(3, 1));

		firstClass = new JCheckBox("First Class");
		roundTrip = new JCheckBox("Round Trip");
		bagsTextField = new JTextField(1);
		bagsLabel = new JLabel("Checked Bags");

		optionsPanel.setBorder(BorderFactory.createTitledBorder("Options"));

		optionsPanel.add(firstClass);
		optionsPanel.add(roundTrip);
		optionsPanel.add(bagsTextField);
		optionsPanel.add(bagsLabel);

		fareButton = new JButton("Fare");
		fareLabel = new JLabel();

		fareButton.addActionListener(new FareButtonListener());

		buttonPanel.add(fareLabel);
		buttonPanel.add(fareButton);
	}

	// FareButtonListener method with a private inner class that handles the actions of the fare button
	private class FareButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double subtotal, tax, total;

			subtotal = getDestinationCost() +
			           getOptionsCost();

			tax = subtotal * TAX_RATE;

			total = subtotal + tax;

			if(roundTrip.isSelected())
				total = total * 2;

			DecimalFormat formatter = new DecimalFormat("0.00");

			fareLabel.setText("Flight Fare: $" + formatter.format(total));

		}
	}

	// Main method
	public static void main(String[] args)
	{
		new BSindala_Project3();
	}
}
