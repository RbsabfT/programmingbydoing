import java.util.Scanner;
import java.util.Random;

public class NumGcounter{
    public static void main(String args[]){
        Scanner I  = new Scanner(System.in);
        Random r = new Random();
        int ans1;
        int ans2 = r.nextInt(10)+1;
        int count=1;
         System.out.println("\nI'm thinking of a number from 1 to 10.");
        while(true){
            System.out.print("Your guess: ");
            ans1 = I.nextInt();
                if(ans1==ans2){
                    System.out.println("\nThat's right!  You're a good guesser..");
                    break;
                } else{
                    System.out.println("\nThat is incorrect.  Guess again."); 
                    count++;
                }
        }
    }
}