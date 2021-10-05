
import java.util.Scanner;
public class BlackJack{
	public static void main(String[] args) {
	    Scanner input= new Scanner(System.in);
	    int a,b,c,d,e,f,g,user=0,dealer=0;
	    String hit="hit",stay="stay";
	    a=(int)(Math.random()*10)+1;
	    b=(int)(Math.random()*10)+1;
	    c=(int)(Math.random()*10)+1;
	    d=(int)(Math.random()*10)+1;
	    e=(int)(Math.random()*10)+1;
	    f=(int)(Math.random()*10)+1;

		System.out.println("Welcome to Mitchell's blackjack program!");
		System.out.println("You get a "+a +" and a "+b+".");
		System.out.println("Your total is "+(a+b)+".");
		System.out.println("The dealer has a "+c +" showing, and a hidden card.");
		System.out.println("His total is hidden, too.");
        user+=a+b;
		while(user<21){
		    System.out.println("Would you like to 'hit' or 'stay'?");
            String act = input.nextLine();
    		if(act.equals(hit)){
                if(user<21){
                    e=(int)(Math.random()*10)+1;
                    System.out.println("You drew a "+e+".");
                    System.out.println("Your total is "+(user+e)+".");
                    user+=e;
                }else if(user>21){
                    break;
                }
    		}else if(act.equals(stay)){
                break;
            }
		}
        if(user<21){
            System.out.println("Okay, dealer's turn.");
            System.out.println("His hidden card was a "+d+".");
            System.out.println("His total was "+(c+d)+".");
            dealer+=c+d;
            while(true){
                if(dealer<17){
                    System.out.println("Dealer chooses to hit.");
                    System.out.println("He draws a "+f+".");
                    System.out.println("His total was "+(dealer+f)+".");
                    dealer+=f;
                }else{
                    System.out.println("Dealer stays.");
                    break;
                }
            }
            System.out.println("His total was "+dealer+".");
            System.out.println("Your total is "+user+".");
            if (dealer>user && dealer <21){
                System.out.println("YOU LOSE.");
            }else if(dealer<user && dealer<21){
                System.out.println("YOU WIN!");
            }else if(dealer==user && dealer<21){
                System.out.println("TIE!");
            }else if(dealer>21){
                System.out.println("DEALER's number is above 21, you WIN!!");
            }else if(dealer==21){
                System.out.println("Dealer got 21, YOU LOSE! DEALER WIN");
            }
        }else if(user==21){
            System.out.print("Dealer's number is above 21!! YOU WIN!!");
        }else if(user>21){
            System.out.print("Your nymber is above 21!! YOU LOSE!!");
        }
    	
	}
}