import java.util.Scanner;
import java.util.Random;

public class KeepGuessing{
    public static void main(String args[]){
        Scanner I = new Scanner(System.in);
        Random r = new Random();
        
        int num = r.nextInt(10)+1;
        int ans =0;
        System.out.println("\nI have chosen a number between 1 and 10. Try to guess it.");
        while(num !=ans){            
            System.out.print("Your guess: ");
            ans = I.nextInt();

            if(ans==num){
                System.out.println("That's right! You're a good guesser.");
                
            }else{
                System.out.println("That is incorrect. Guess again~\n");
              
            }
        }
    }
}