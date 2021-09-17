import java.util.Scanner;
import java.util.Random;

public class AddValues{
    public static void main(String args[]){
        Scanner I = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        System.out.println("\nI will add up the numbers you give me.");
        while(true){
            System.out.print("Number : ");
            num = I.nextInt();
            sum = sum + num;
            System.out.println("The total so far is "+sum);

            if(num==0){
                System.out.println("\nThe total is "+sum);
                break;
            }
        }
    }
}