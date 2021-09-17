import java.util.Scanner;

public class CountingWhile {
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
        
		System.out.println( "Type in a message, and I'll display it several times." );
		System.out.print( "Message: \n" );
        String message = keyboard.nextLine();
        System.out.println("How many times do you want to display?");
        int time = keyboard.nextInt();
		

		int n = 1;
		while ( n < time+1)
		{
			System.out.println( (n*10) + ". " + message );
			n++;
		}

	}
}