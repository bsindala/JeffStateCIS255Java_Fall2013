// Boniface Sindala
// CIS 255 (Fall 2013)
// Laboratory Assignment 12
// December 4, 2013
// In this assignment, I will work with Java Applet Syntax
// to create an applet that draws a circle with a different
// color in a different position every time the user clicks any
// location within the applet area.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BSindala_Lab12 extends JApplet
{
	private Color FILL_COLOR = Color.red;
	private final int CLICKS = 1;
	private final int X_COORDINATE = 25;
	private final int Y_COORDINATE = 25;
	private static int WIDTH = 150;
	private static int HEIGHT = 150;

	public void init()
	{
		addMouseListener(new MyMouseListener());
	}
}