import java.util.Scanner;

public class DumbCalculator{
    public static void main( String[] args){
        float fnum;
        float snum;
        float tnum;
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nWhat is your first number? ");
        fnum = input.nextFloat();
        System.out.print("\nWhat is your second number? ");
        snum = input.nextFloat();
        System.out.print("\nWhat is your third number? ");
        tnum = input.nextFloat();

        System.out.print("\n("+fnum +" + "+snum+" + "+tnum+") / 2"+" = "+ (fnum + snum + tnum)/2);        
    }
}