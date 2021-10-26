import java.util.Scanner;
    
public class two {
    public static void menu(){
        System.out.println("\nWelcome to Pythaorean Theorem Calculator");
        System.out.println("a^2 + b^2 = c^2");
        
    }
    
    public static void ask(){
        Scanner input= new Scanner(System.in);

        String an1;
        double a,b,c;
        double num1, num2;
        
        System.out.println("Solving for Hypoten(h) or Leg(l)?");
        an1=input.nextLine();
        
        if(an1.equals("h")){
            System.out.print("Enter side A: ");
            num1 = input.nextDouble();
            System.out.print("Enter side B: ");
            num2 = input.nextDouble();
            
            a = Math.pow(num1, 2);
            b = Math.pow(num2, 2);
            c = Math.sqrt(a+b);
            System.out.println("\nSide C is: "+c);
            
        }else if(an1.equals("l")){
            System.out.print("Enter side A: ");
            num1 = input.nextDouble();
            System.out.print("Enter side C: ");
            num2 = input.nextDouble();
            
            a = Math.pow(num1, 2);
            c = Math.pow(num2, 2);
            b = Math.sqrt(c-a);
            System.out.println("\nSide B is: "+b);
        }
    }

    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        String fin;
        while(true){
            menu();
            ask();
            System.out.println("\nSolve another Triangle?(y/n) ");
            fin =input.nextLine();
            if(fin.equals("n")){
                break;
            }
        };
        System.out.println("\nThank you for using this program!");
    }
}