import java.awt.*;
import javax.swing.JFrame;
import java.io.File;
import javax.imageio.ImageIO;

public class image extends Canvas
{
	Image coolFace;
	
	public image() throws Exception
	{
		coolFace = ImageIO.read( new File("jj.png") );
		// Java supports PNG, JPEG, and GIF (but not animated GIFs). It does not support BMP.
	}
	
	public void paint( Graphics g )
	{
		//           Image  , x,  y, this
		g.drawImage(coolFace,100,100,this);
		
		// And, just for fun, let's give me a halo! This halo designed by Liz O in 2012.
		
	}

	public static void main(String[] args) throws Exception
	{
		JFrame win = new JFrame("Image Demo");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new image() );
		win.setVisible(true);
	}


}