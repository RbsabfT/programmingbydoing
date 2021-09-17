import java.util.Scanner;

public class NameAgeAndSalary{
    public static void main( String[] args){
        Scanner input = new Scanner(System.in);
        String name = "";
        int age;
        double salary;
        System.out.print("Hello. What is your name? ");
        name = input.nextLine();
        System.out.print("\nHello, "+name+" ! How old are you? ");
        age = input.nextInt();
        System.out.print("\nSo you're "+age+ ", eh? That not old at all! ");
        System.out.print("\nHow much do you make, "+name+" ? ");
        salary = input.nextInt();
        System.out.print(salary + "! I hope that's a per hour and not per year! Lol");

    }
}