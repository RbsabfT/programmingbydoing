import java.util.Scanner;
public class CountMachR {
    public static void main(String[]args){
        Scanner I = new Scanner(System.in);
        System.out.print("Count from : ");
        int num1 = I.nextInt();
        System.out.print("Count to : ");
        int num2 = I.nextInt();
        System.out.print("Count by : ");
        int num3 = I.nextInt();

        for(int i=num1;i<num2+1;i=i+num3){
            System.out.print(i+" ");
        }
    }
}