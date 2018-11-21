// Boniface Sindala
// CIS 255 (Fall 2013)
// Laboratory Assignment 11
// November 20, 2013
// In this assignment, I work with Java GUI syntax to create a window that allows
// the user to enter the numbers of miles for a trip and number of gallons of fuel used
// and displays the fuel economy for the trip when the user clicks a button.

import javax.swing.*;           // Needed for swing classes
import java.awt.event.*;        // Needed for ActionListener interface
import java.awt.*;              // Needed for FlowLayout Class
import java.text.DecimalFormat; // Needed for formatting the result

public class BSindala_Lab11 extends JFrame
{
	private JPanel windowPanel;
	private JLabel milesLabel;
	private JTextField milesTextField;
	private JLabel gallonsLabel;
	private JTextField gallonsTextField;
	private JLabel resultLabel;
	private JButton calculationButton;

	// Constructor for the panel
	public BSindala_Lab11()
	{
		setTitle("Fuel Economy Calculator");
		setSize(250, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(windowPanel);
		setVisible(true);
	}

	// buildPanel method for adding a panel, 3 labels, 2 textfields, and 1 button
	private void buildPanel()
	{
		setLayout(new GridLayout()); // Adding a GridLayout manager to the content pane

		milesLabel = new JLabel("Miles Driven");
		milesTextField = new JTextField(8);
		gallonsLabel = new JLabel("Gallons Used");
		gallonsTextField = new JTextField(8);
		resultLabel = new JLabel("Click Button to See Result");
		calculationButton = new JButton("Calculate");

		// Add actionListener to the button
		calculationButton.addActionListener(new CalculationButtonListener());

		windowPanel = new JPanel();

		// Adding 6 buttons
		windowPanel.add(milesLabel);
		windowPanel.add(milesTextField);
		windowPanel.add(gallonsLabel);
		windowPanel.add(gallonsTextField);
		windowPanel.add(resultLabel);
		windowPanel.add(calculationButton);

	}

	// ActionListener is an action listener for the Calculate Button
	private class CalculationButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String input, resultText = "";
			double miles, gallons, resultConverted = 0.0;
			DecimalFormat converter = new DecimalFormat("0.0");

			// Acquire input from user
			input = milesTextField.getText();
			miles = Double.parseDouble(input);
			input = gallonsTextField.getText();
			gallons = Double.parseDouble(input);

			// Calculate the miles per gallon value
			resultConverted = miles / gallons;
			resultText = "Fuel economy was " + converter.format(resultConverted) + " miles per gallon. ";

			// Set the resultText to the resultLabel
			resultLabel.setText(resultText);

		}
	}

	public static void main(String[] args)
	{
		new BSindala_Lab11();
	}
}