// Boniface Sindala
// CIS 255 (Fall 2013)
// Laboratory Assignment 8 (Circle)
// October 18, 2013
// Code for the circle class for BSindala_Lab08.java
import javax.swing.JOptionPane;

public class Circle
{
	private double radius;

	// No argument constructor for the default radius
	public Circle()
	{
		radius = 1.0;
	}

	/** Constructor with
	    @param r for radius */
	public Circle(double r)
	{
		if (r > 0)
		{
			radius = r;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Radius can not be a Negative number.");
			JOptionPane.showMessageDialog(null, "Radius will be defaulted to 1.00");
			radius = 1.0;
		}
	}

	/** Module for setting the radius
	    @param rad for radius */
	public void setRadius(double rad)
	{
		radius = rad;

		if (rad > 0)
		{
			radius = rad;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Radius can not be a Negative number.");
			JOptionPane.showMessageDialog(null, "Radius will be defaulted to 1.00");
			radius = 1.0;
		}

	}

	// Module for radius
	public double getRadius()
	{
		return radius;
	}

	// Module for calculation the diameter
	public double getDiameter()
	{
		return 2.0 * radius;
	}

	// Module for calculating the area
	public double getArea()
	{
		return Math.PI * Math.pow(radius, 2);
	}

	// Module for calculating the circumference
	public double getCircumference()
	{
		return Math.PI * getDiameter();
	}
}