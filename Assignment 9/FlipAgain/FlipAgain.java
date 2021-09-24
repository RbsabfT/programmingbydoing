// It still works, because in the do-while loop, every time it runs, the code will input the variable y or n into "again".
import java.util.Random;
import java.util.Scanner;

public class FlipAgain {
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random rng = new Random();
		String again = "n";

		do{
			int flip = rng.nextInt(2);
			String coin;

			if ( flip == 1 )
				coin = "HEADS";
			else
				coin = "TAILS";

			System.out.println( "You flip a coin and it is... " + coin );

			System.out.print( "Would you like to flip again (y/n)? " );
			again = keyboard.next();
		}while (again.equals("y"));
	}
}