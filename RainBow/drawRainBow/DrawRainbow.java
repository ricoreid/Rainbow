package drawRainBow;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawRainbow extends JPanel
{
	// defines colors Indigo and Violet
	final Color INDIGO = new Color(128, 0, 128);
	final Color VIOLET = new Color(75, 0, 130);
	
	// colors to use in the rainbow, starting from the innermost
	// The two white entries result in an empty arc in the center
	private Color colors[] = {Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED };
	
	// Constructor
	public DrawRainbow()
	{
		setBackground(Color.WHITE);
	} // end DrawRainbow constructor
	
	// draws a rainbow using concentric circles
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		int radius = 20; // radius of the arc
		
		//draws the rainbow near the bottom-center
		int centerX = getWidth() / 2;
		int centerY = getHeight() - 10;
		
		System.out.printf("point X is:  %d... point Y is: %d\n", centerX, centerY);
		
		// draws fill arc starting with he outermost
		for(int counter = colors.length; counter > 0; counter--)
		{
			// set the color for the current arc
			g.setColor(colors[counter - 1]);
			
			// fill the arc from 0 to 180 degrees
	g.fillArc(centerX - counter * radius, centerY - counter * radius, counter * radius * 2, counter * radius * 2, 0, 180);
	
		} // end for
	} // end method paintComponent
} // end class DrawRainbow
