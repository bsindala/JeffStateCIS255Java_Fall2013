// Boniface Sindala
// CIS 255 (Fall 2013)
// Laboratory Assignment 8
// October 18, 2013
// In this assignment, I will work with Java class syntax to create
// a class to store and retrieve information about a circle:
// I will the instatiate this circle in three different circle objects.
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class BSindala_Lab08
{
	public static void main(String[] args)
	{
		double circleRadius;
		String radiusInput;

		// Instances of the class
		Circle bCircle1 = new Circle();
		Circle bCircle2 = new Circle(7.0);

		radiusInput = JOptionPane.showInputDialog("Enter the radius of the circle "
												+ "correct to 2 decimal places.");
		circleRadius = Double.parseDouble(radiusInput);
		Circle bCircle3 = new Circle(circleRadius);

		// Output formatted by Decimal Format
		DecimalFormat formatter = new DecimalFormat("#0.00");
		JOptionPane.showMessageDialog(null, "Circle #1: \nRadius: " + formatter.format(bCircle1.getRadius()) +
									  "\nDiameter: " + formatter.format(bCircle1.getDiameter()) +
									  "\nArea: " + formatter.format(bCircle1.getArea()) +
									  "\nCircumference: " + formatter.format(bCircle1.getCircumference()));

		JOptionPane.showMessageDialog(null, "Circle #2: \nRadius: " + formatter.format(bCircle2.getRadius()) +
									  "\nDiameter: " + formatter.format(bCircle2.getDiameter()) +
									  "\nArea: " + formatter.format(bCircle2.getArea()) +
									  "\nCircumference: " + formatter.format(bCircle2.getCircumference()));

		JOptionPane.showMessageDialog(null, "Circle #3, With the Radius you entered: \nRadius: " + formatter.format(bCircle3.getRadius()) +
									  "\nDiameter: " + formatter.format(bCircle3.getDiameter()) +
									  "\nArea: " + formatter.format(bCircle3.getArea()) +
									  "\nCircumference: " + formatter.format(bCircle3.getCircumference()));

		// New radius requested for the input
		radiusInput = JOptionPane.showInputDialog("Enter a new radius of the circle "
														+ "correct to 2 decimal places.");
		circleRadius = Double.parseDouble(radiusInput);
		bCircle3.setRadius(circleRadius);

		JOptionPane.showMessageDialog(null, "Circle #4: \nRadius: " + formatter.format(bCircle3.getRadius()) +
									  "\nDiameter: " + formatter.format(bCircle3.getDiameter()) +
									  "\nArea: " + formatter.format(bCircle3.getArea()) +
									  "\nCircumference: " + formatter.format(bCircle3.getCircumference()));

	}
}