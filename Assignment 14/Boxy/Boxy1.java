import java.awt.*;
import javax.swing.JFrame;

public class Boxy1 extends Canvas
{
	public void paint( Graphics window )
	{
		// this code draws a 100x100 box in blue at (200,300)
		window.setColor(Color.BLUE);
		window.fillRect(200,300,100,100);
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.WHITE);
		window.fillRect(210,310,80,80);
		
		// draw three more boxes -- different colors, different places
		window.setColor(Color.RED);
		window.fillRect(150,170,100,100);

		window.setColor(Color.WHITE);
		window.fillRect(160,180,80,80);

		window.setColor(Color.YELLOW);
		window.fillRect(400,170,100,100);

		window.setColor(Color.WHITE);
		window.fillRect(410,180,80,80);

		window.setColor(Color.PINK);
		window.fillRect(50,50,100,100);

		window.setColor(Color.WHITE);
		window.fillRect(60,60,80,80);
	}

	public static void main( String[] args )
	{
		Canvas canvas = new Boxy1();
		JFrame win = new JFrame("Boxy1 - make them manually");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setBackground(Color.WHITE);
		win.add( canvas );
		win.setVisible(true);
	}
}