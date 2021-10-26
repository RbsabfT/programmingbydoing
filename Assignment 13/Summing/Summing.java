import java.util.Scanner;
import java.io.*;

public class SummingThreeNumbersFromAnyFile{
	public static void main(String[] args) throws IOException{
		Scanner r = new Scanner(System.in);
		int num1, num2, num3;
		String file;
		
		System.out.print( "Which file would you like to read numbers from: " );
		file = r.next();
		
		File in = new File(file);
		Scanner ipt = new Scanner(in);
		
		System.out.println( "Reading numbers from file \"" + file + "\"\n" );
		
		num1 = ipt.nextInt();
		num2 = ipt.nextInt();
		num3 = ipt.nextInt();
		ipt.close();

		System.out.println( num1 + " + " + num2 + " + " + num3 + " = " + (num1+num2+num3));
	}
	
}