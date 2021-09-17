import java.util.Scanner;

public class GenderGame
{
    public static void main( String[] args){
        Scanner I = new Scanner(System.in);
        System.out.print("What is you gender? (M or F): ");
        String ans1 = I.nextLine();
        System.out.print("First name: ");
        String ans2 = I.nextLine();
        System.out.print("Last name: ");
        String ans3 = I.nextLine();
        System.out.print("Age: ");
        int ans4 = I.nextInt();
        String ans5 = "";
        if(ans1.equals("M")){
            if(ans4 < 20){
                System.out.println("Then, I should call you "+ans2+" "+ans3+".");
            }else if(ans4 >= 20){
                ans5 = "Mr.";
                System.out.println("Then, I should call you "+ans5+ans2+".");
            }
        }else if(ans1.equals("F")){
            if(ans4 < 20){
                System.out.println("Then, I should call you "+ans2+" "+ans3+".");
            }else if(ans4 >= 20){
                System.out.print("Are you married, "+ans2+"? (y or n)");
                String ans6 = I.nextLine();
                
                if(ans6.equals("y")){
                    ans5 = "Mrs.";
                    System.out.println("Then, I should call you "+ans5+ans2+".");
                }else if(ans6.equals("n")){
                    ans5 = "Ms.";
                    System.out.println("Then, I should call you "+ans5+ans2+".");
                }
            }
            
        }
    }
}