// width:800px height:600px
// Draws the outline of the rectangle.
// Fills an oval bounded by the rectangle with the current color.
// Draws the text given by the specified string, using this graphics context's current font and color.
// Black below, blue on top

import java.awt.*;
import javax.swing.JFrame;
import java.lang.Math;

public class Clockface extends Canvas
{
	public void paint( Graphics g )
	{
		g.drawOval(150,150,300,300);  // draw a rectangle
		
		g.setColor(Color.black);
		g.drawString("12", 290, 180);
        g.drawString("3", 430, 300);
        g.drawString("6", 300, 440);
        g.drawString("9", 160, 300);


        g.drawRect(70,70,460,460);
        
        g.fillRect(180,298,125,3);

		g.drawLine(200,350,300,300);


        Color ggrey = new Color(85,88,90);
        g.setColor(ggrey);
        g.fillOval(295,295,10,10);
	}

	public static void main( String[] args )
	{
		// You can change the title or size here if you want.
		JFrame win = new JFrame("Demo1");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Clockface canvas = new Clockface();
		win.add( canvas );
		win.setVisible(true);
	}
}