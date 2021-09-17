import java.util.Scanner;

public class ALittleQuiz{
    public static void main( String[] args){
        String ans1 = "";
        String ans2 = "";
        String ans3 = "";
        String ans4 = "";
        int count = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Are you ready for the quiz?");
        System.out.println("a) yes \nb) no");
        ans1 = input.nextLine();
        if(ans1.equals("b")){
            System.out.println("Well you have no choice~~");
        }else{
            System.out.println("Let start!");
        }
        System.out.println("Ok, here it comes!");
        
        System.out.println("\nQ1) What is the capital of Alaska?");
        System.out.println("a) Melbourne \nb) Anchorage \nc) Juneau");
        ans2 = input.nextLine();
        if(ans2.equals("a") || ans2.equals("b")){
            System.out.println("You're wrong");
        }else{
            System.out.println("That's right!");
            count += 1;
        }
        
        System.out.println("\nQ2) Can you store the value 'cat' in a variable of type int?");
        System.out.println("a) Yes \nb) No");
        ans3 = input.nextLine();
        if(ans3.equals("a")){
            System.out.println("Sorry, 'cat' is a string. ints can only store numbers.");
        }else {
            System.out.println("That's right!");
            count += 1;
        }

        System.out.println("\nQ3) What is the result of 9+6/3? ");
        System.out.println("a) 5 \nb) 11 \nc) 15/3");
        ans4 = input.nextLine();
        if(ans4.equals("b")){
             System.out.println("That's correct!");
            count += 1;
        }else{
            System.out.println("That's wrong");
        }
        
        System.out.println("Overall, you got "+count+" out of 3 correct.\nThanks for playing!");
    } 
}