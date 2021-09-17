// The if statement executes a block of code if a specified condition is true. If the condition is false, another block of code can be executed.
// The curly braces will set up the range where the code will be include in the if/else statement.
public class WhatIf
{
	public static void main( String[] args )
	{
		int people = 40;
		int cats = 60;
		int dogs = 30;

		if ( people < cats )
		{
			System.out.println( "Too many cats!  The world is doomed!" );
		}

		if ( people > cats )
		{
			System.out.println( "Not many cats!  The world is saved!" );
		}

		if ( people < dogs )
		{
			System.out.println( "The world is drooled on!" );
		}

		if ( people > dogs )
		{
			System.out.println( "The world is dry!" );
		}

		dogs += 5;

		if ( people >= dogs )
		{
			System.out.println( "People are greater than or equal to dogs." );
		}

		if ( people <= dogs )
		{
			System.out.println( "People are less than or equal to dogs." );
		}

		if ( people == dogs )
		{
			System.out.println( "People are dogs." );
		}
	}
}