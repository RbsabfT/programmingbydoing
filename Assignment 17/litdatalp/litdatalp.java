import java.util.Scanner;
class Student
{
	String name;
	int grade;
	double avg;
}
public class litdatalp{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		Student data[] = new Student[3];
		
		for(int i=0; i<data.length; i++){
			
			data[i]=new Student();
			System.out.print("Enter student " +(i+1)+"'s name: ");
			data[i].name = keyboard.next();
			System.out.print("Enter student "+(i+1)+"'s grade: ");
			data[i].grade = keyboard.nextInt();
			System.out.print("Enter student "+(i+1)+"'s average: ");
			data[i].avg = keyboard.nextDouble();
			System.out.println();
					
		}
		System.out.println("The names are: "+data[0].name+" "+data[1].name+" "+data[2].name);
		System.out.println("The grades are: "+data[0].grade+" "+data[1].grade+" "+data[2].grade);
		System.out.println("The averages are: "+data[0].avg+" "+data[1].avg+" "+data[2].avg);
		System.out.println();
		
	
		
		
	}
}