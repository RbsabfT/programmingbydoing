import java.util.Random;
public class FortuneCookie{
    public static void main(String[] args){
        Random r = new Random();
        System.out.println("\nFortune cookie says: 'You will find happiness with a new love.'");
        int num1 = r.nextInt(54)+1;
        int num2 = r.nextInt(54)+1;
        int num3 = r.nextInt(54)+1;
        int num4 = r.nextInt(54)+1;
        int num5 = r.nextInt(54)+1;
        int num6 = r.nextInt(54)+1;

        System.out.println(num1+" - "+num2+" - "+num3+" - "+num4+" - "+num5+" - "+num6+"\n");
    }
}