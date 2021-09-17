import java.util.Scanner;

public class EnterPin{
    public static void main(Strings arg[]){
        
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;

		System.out.println("WELCOME TO THE BANK OF MITCHELL.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();

		while ( entry != pin ){
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}

		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
	}
}

// While loop is similar to if statement that they both will return a solution when each of their variable has meet the condition in the bracket.
// While Loop is different from a if statement that while lopp will keep running until the requirement is met, but if statement will only run once.
// Variable "Entry" was already defined before the while loop.
// The variable entry will be refresh again and again since the variable was called repeatedly.