import java.util.Scanner;
import java.io.File;

public class SimpleF{
	public static void main( String[] args ) throws Exception{
		
		Scanner file = new Scanner(new File("name.txt"));
		String fn =file.next();
		String ln =file.next();
		
		System.out.println( "Using my psychic powers aided by reading data from the file, I have" );
		System.out.println( "determined that your name is " +fn+" "+ln+"." );
		System.out.println( "Amazing, huh?" );
	}
}