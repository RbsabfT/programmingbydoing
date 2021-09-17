import java.util.Scanner;
public class TwoMQ{
    public static void main(String[] args){
        Scanner I = new Scanner(System.in);
        System.out.println("\nTWO MORE QUESTIONS, BABY!");
        System.out.println("\nThink of something and I'll try to guess it!");
        System.out.print("\nQuestion 1) Does it stay inside or outside or both?: ");
        String ans1 = I.nextLine();

        System.out.println("Question 2) Is it a living thing? :");
        String ans2 = I.nextLine();
        if(ans2.equals("yes")){
            if(ans1.equals("outside")){
                System.out.println("\nIt's too broad for be to guess, how dare you");
            }
            if(ans1.equals("inside")){
                System.out.println("\nIs it a puppy or cat? I'm not sure about it.");
            }
            if(ans1.equals("both")){
                System.out.println("\nLet me think for a second, what else could you think of besides pet?");
            }

        }
        if(ans2.equals("no")){
            if(ans1.equals("outside")){
                System.out.println("\nIt's a rock! I guess.");
            }
            if(ans1.equals("inside")){
                System.out.println("\nIs it a furniture in the house?");

            }
            if(ans1.equals("both")){
                System.out.println("\nThen it's a special creature or thing, I guess");

            }

        }
    }
}