import java.util.Scanner;
import java.util.Random;

public class NumGuessGame{
    public static void main(String[]args){
        Scanner I  = new Scanner(System.in);
        Random r = new Random();
        System.out.println("\nI'm thinking of a number from 1 to 10.");
        System.out.print("Your guess: ");
        int ans1 = I.nextInt();

        int ans2 = r.nextInt(10)+1;

        if(ans1==ans2){
            System.out.println("\nThat's right!  My secret number was "+ans2+".");
        } else{
            System.out.println("\nSorry, but I was really thinking of "+ans2+"."); 
        }
    }
}