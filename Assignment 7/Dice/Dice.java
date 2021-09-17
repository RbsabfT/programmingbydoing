import java.util.Random;
public class Dice{
    public static void main(String[]args){
        Random r = new Random();
        System.out.println("\nHERE COMES THE DICE!");
        int ans1 = r.nextInt(6)+1;
        System.out.println("Roll #1: "+ans1);
        int ans2 = r.nextInt(6)+1;
        System.out.println("Roll #2: "+ans2);
        int ans3=ans1+ans2;
        System.out.print("The total is "+ans3+"!");
        

    }
}