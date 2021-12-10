import java.util.Scanner;
class Student
{
	String name;
	int grade;
	double avg;
}
public class Basic{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		Student one = new Student();
		Student two = new Student();
		Student three = new Student();
		System.out.print("Enter the first student's name: ");
		one.name = keyboard.next();
		System.out.print("Enter the first student's grade: ");
	    one.grade = keyboard.nextInt();
		System.out.print("Enter the first student's average: ");
		one.avg = keyboard.nextDouble();
		System.out.println();
		System.out.print("Enter the second student's name: ");
		two.name = keyboard.next();
		System.out.print("Enter the second student's grade: ");
		two.grade = keyboard.nextInt();
		System.out.print("Enter the second student's average: ");
		two.avg = keyboard.nextDouble();
		System.out.println();
		System.out.print("Enter the third student's name: ");
		three.name = keyboard.next();
		System.out.print("Enter the third student's grade: ");
		three.grade = keyboard.nextInt();
		System.out.print("Enter the third student's average: ");
		three.avg = keyboard.nextDouble();
		System.out.println();
	
		System.out.println("The names are: "+ one.name+" "+two.name+" "+three.name);
		System.out.println("The grades are: "+ one.grade+" "+two.grade+" "+three.grade);
		System.out.println("The averages are: "+ one.avg+" "+two.avg+" "+three.avg);
		System.out.println();
		double total =  one.avg + two.avg + three.avg;
		double total_avg = total/3.0;
		
		System.out.printf("The average for the three students is: "+"%.6f", total_avg);
	}
}