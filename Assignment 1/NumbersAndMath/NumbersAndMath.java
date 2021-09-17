public class NumbersAndMath
{
    public static void main( String[] args){
        // Print I will now count my chickens : 
        System.out.println( "I will now count my chickens:" );
        // Calculate the total amounts of Hens.
		System.out.println( "Hens " + ( 25.0 + 30.0 / 6.0 ) );
		// Calculate the total amounts of Roosters.
        System.out.println( "Roosters " + ( 100.0 - 25.0 * 3.0 % 4.0 ) );
        // Print now I will count the eggs :
		System.out.println( "Now I will count the eggs:" );
        // The amount of eggs
		System.out.println( 3.0 + 2.0 + 1.0 - 5.0 + 4.0 % 2.0 - 1.0 / 4.0 + 6.0 );
        // Print the question of asking whether 3 + 2 < 5 -7 is return true.
		System.out.println( "Is it true that 3 + 2 < 5 - 7?" );
        // Since the calculation 3+2 is not < than 5-7, it returns false.
		System.out.println( 3.0 + 2.0 < 5.0 - 7.0 );
        // Print what is 3 + 2 and print out the solution of 5
		System.out.println( "What is 3 + 2? " + ( 3.0 + 2.0 ));
		// Print what is 5 -7 and print out the solution of -2
        System.out.println( "What is 5 - 7? " + ( 5.0 - 7.0 ));
        // Print Oh, that's why it's false.
		System.out.println( "Oh, that's why it's false." );
        // Print How about some more/
		System.out.println( "How about some more." );
        // Print Is it greater? and returns true as the result since 5 is > than -2.
		System.out.println( "Is it greater? " + ( 5.0 > -2.0));
		// Print Is it greater or equal? and returns true as the result since 5 is > than -2.
        System.out.println( "Is it greater or equal? " + ( 5.0 >= -2.0 ));
        // Print Is it less or equal? and returns false since 5 is not < or = to -2.
		System.out.println( "Is it less or equal? " + ( 5.0 <= -2.0 ));
    }
}