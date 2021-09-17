import java.util.Scanner;

public class TheWorseNum{
    public static void main (String[] args){
        Scanner I = new Scanner(System.in);
        System.out.println("TEH WORST NUBMER GESSING GAME EVAR!!!!!!!!!");
        System.out.print("\nI'M THKING OF A NBR FROM 1-10.  TRY 1 GuESS! ");
        int ans = I.nextInt(); 
        if(ans == 4){
            System.out.println("\nLOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS 4!");
        } else{
            System.out.println("\n00T!  U SUX0R!!!  I PWN J00!!!  IT WAS 4!");
        }


    }
}