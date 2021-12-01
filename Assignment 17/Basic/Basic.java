import java.net.URL;
import java.util.Scanner;

class Address
{
	String street;
	String city;
	String state;
	int zip;
}

public class Weba{
	public static void main(String[] args) throws Exception
	{
		URL addys = new URL("https://programmingbydoing.com/a/examples/fake-addresses.txt");

		Address[] addybook = new Address[5];

		Scanner fin = new Scanner( addys.openStream() );
        System.out.println("Enter the first student's name: ");
        oneS.name = fin.next();
        System.out.print("Enter the first student's grade: ");
        System.out.print("Enter the first student's average: ");
        System.out.println("");
        System.out.print("Enter the second student's name: ");
        System.out.print("Enter the second student's grade: ");
        System.out.print("Enter the second student's average: ");
        System.out.println("");
        System.out.print("Enter the third student's name: ");
        System.out.print("Enter the third student's grade: ");
        System.out.print("Enter the third student's average: ");
	}
}
