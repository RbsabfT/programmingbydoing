import java.util.Scanner;
import java.util.Random;

public class LimitedTries{
    public static void main(String []args){
        Scanner I = new Scanner(System.in);
        Random r = new Random();
        
        int num = r.nextInt(100)+1;
        int ans =0;
        int count=1;
        System.out.println("\nI'm thinking of a number between 1-100.  You have 7 guesses.");
        while(num !=ans){            
            System.out.print("Guess # "+count+": ");
            ans = I.nextInt();
            count++;
            
            if(count<8){
                if(ans==num){
                    System.out.println("You guessed it!  What are the odds?!?");
                }else if(ans>num){
                    System.out.println("Sorry, that guess is too high.");
                }else if(ans<num){
                    System.out.println("Sorry, you are too low.");
                }
            }else{
                System.out.print("Sorry, you didn't guess it in 7 tries.  You lose.");
                break;
            }
        }
    }
}