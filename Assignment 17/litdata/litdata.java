import java.util.Scanner;
class Student
{
	String name;
	int grade;
	double avg;
}
public class litdata{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		Student data[] = new Student[3];
		
		data[0]=new Student();
		System.out.print("Enter the first student's name: ");
		 data[0].name = keyboard.next();
		System.out.print("Enter the first student's grade: ");
		 data[0].grade = keyboard.nextInt();
		System.out.print("Enter the first student's average: ");
		 data[0].avg = keyboard.nextDouble();
		System.out.println();
		
		data[1]=new Student();
		System.out.print("Enter the second student's name: ");
		 data[1].name = keyboard.next();
		System.out.print("Enter the second student's grade: ");
		 data[1].grade = keyboard.nextInt();
		System.out.print("Enter the second student's average: ");
		 data[1].avg = keyboard.nextDouble();
		System.out.println();
		
		data[2]=new Student();
		System.out.print("Enter the third student's name: ");
		data[2].name = keyboard.next();
		System.out.print("Enter the third student's grade: ");
		data[2].grade = keyboard.nextInt();
		System.out.print("Enter the third student's average: ");
		data[2].avg = keyboard.nextDouble();
		System.out.println();
	
		System.out.println("The names are: "+data[0].name+" "+data[1].name+" "+data[2].name);
		System.out.println("The grades are: "+data[0].grade+" "+data[1].grade+" "+data[2].grade);
		System.out.println("The averages are: "+data[0].avg+" "+data[1].avg+" "+data[2].avg);
		System.out.println();
		
	}
}