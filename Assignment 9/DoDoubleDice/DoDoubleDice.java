import java.util.Random;

public class DoDoubleDice{
    public static void main(String[]args){
        Random r = new Random();
        int ans1 =0;
        int ans2 =0;
        System.out.println("\nHERE COMES THE DICE!");
        
        do{
            ans1 = r.nextInt(6)+1;
            System.out.println("\nRoll #1: "+ans1);
            ans2 = r.nextInt(6)+1;
            System.out.println("Roll #2: "+ans2);
            int ans3=ans1+ans2;
            System.out.print("The total is "+ans3+"!\n");
        } while(ans1!=ans2);
    }
}