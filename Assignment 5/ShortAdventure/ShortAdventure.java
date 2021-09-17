import java.util.Scanner;

public class ShortAdventure{
    public static void main(String[] args){
        Scanner I = new Scanner(System.in);

        System.out.println("Welcome to the adventure");
        System.out.println("Would you like to start the game?((y)Yes or (n)No)");
        String f = I.nextLine();

        if (f.equals("y")){
        System.out.println("\nWhen Bob is going to enter his house, he hears the sound of dishes smashing on the floor from the direction of the cafetria. What should he do? a) Call the police! b)Enter to see what happened.");
        String s = I.nextLine();
            
            if (s.equals("a")){
                System.out.println("\nCall the police!");
                System.out.println("\nAfter a few minute, police arrived. Police ask Bob for the agreement to enter his house. What should he do? a) Open the door widely to let them enter. b) Say no and ask them there might be a better way to do it.");
                String t = I.nextLine();
                    if (t.equals("a")){
                        System.out.println("\nOpen the door widely to let them enter.");
                        System.out.println("\nAfter hours of seaarching, they realized that all the sounds from the cafeteria all produce by his cat.");
                    } else if(t.equals("b")){
                        System.out.println("\nSay no and ask them there might be a better way to do it.");
                        System.out.println("\n the police can't figure out an another way to solve it, so they left.");
                    }
                } else if(s.equals("b")){
                System.out.println("\nEnter to see what happened.");
                System.out.println("\nInside the house is such a disaster; books, plates, shelves are all over the place. After glancing at the view, he sees a creature standing in the middle of the room. He realized that it's his cat. How can Bob punish the cat properly? a) Beat the cat up. b) Send it into the cage.  ");
                String tt = I.nextLine();
                    if (tt.equals("a")){
                        System.out.println("\nBeat the cat up.");
                        System.out.println("\nSorry but no, it's animal violence.");
                    } else if (tt.equals("b")){
                        System.out.println("\nSend it into the cage");
                        System.out.println("\nYeah, better way to solve it.");
                    }
            }
        } else if(f.equals("n")){
            System.out.println("\nWhy? Can you give a reason? a) It's so boring b) I just don't care ");
            String ss = I.nextLine();
            if (ss.equals("a")){
                System.out.println("\nIt's so boring");
                System.out.println("\nActually it's not true, this game is full of plots and emotional reactions. People actually said it's fun. a) Oh really? Then why the game rate only has a 3.3 point? b) Ummmm....feel susbicious but don't knonw how to describe it.");
                    String ttt = I.nextLine();
                    if (ttt.equals("a")){
                        System.out.println("\nOh really? Then why the game rate only has a 3.3 point?");
                        System.out.println("\nHum....Is that true? Do you search the wrong keywords?");
                    } else if (ttt.equals("b")) {
                        System.out.println("\nUmmmm....feel susbicious but don't knonw how to describe it.");
                        System.out.println("\nAnyway, don't worry and just try it.");
                    }
                } else if(ss.equals("b")){
                System.out.println("\nI just don't care");
                System.out.println("\nJust try once, and I dougt you will enjoy it. a) Okay, I'll give it a try. b) Nope, I will not play it.");
                String tttt = I.nextLine();
                    if (tttt.equals("a")){
                        System.out.println("\nOkay, I'll give it a try.");
                        System.out.println("\nGreat!! Then you just refresh the page to restart the game");
                    }  else if (tttt.equals("b")){
                        System.out.println("\nNope, I will not play it.");
                        System.out.println("\nSike, it's just a normal game.");
                    }
            }
        }
    }
}