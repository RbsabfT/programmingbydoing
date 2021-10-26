import java.net.URL;
import java.util.Scanner;

public class Simple{
	public static void main(String[] args) throws Exception{
		URL mcool = new URL("https://cs.leanderisd.org/mitchellis.txt");
		Scanner r = new Scanner( mcool.openStream() );
		
		while(r.hasNext()){
            String oe = r.nextLine();
            System.out.println(oe);
		}
		r.close();
	}
}