import java.util.Scanner;
public class CountingMachine{
    public static void main(String []args){
        Scanner I = new Scanner(System.in);    
        System.out.print("\nCount to:");
        int count = I.nextInt();

        for(int i=0;i<count+1;i++){
            System.out.print(i+" ");
        }
    }
}