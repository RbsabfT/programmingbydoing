import java.util.*;

public class NumPuzzle{
	public static void display(){
		for (int t = 1; t <= 5; t++ ){
			for (int o = 0; o < 10; o++ ){
				if ( (t + o) > 10 && ( (t * 10) + o) <= 56 ){ 
					System.out.print( t + "" + o + " ");
                }
			}
		}
	}
	
	
	public static void NP2(){	
		for ( int t = 1; t < 10; t++){
			for ( int o = 0; o < 10; o++ ){
				if ( ((t * 10) + o) - ((o * 10) + (t)) == ((t) + o) ){
					System.out.println((t * 10) + o );
                }
			}
		}
	}

	public static int menu(){
		Scanner kb = new Scanner(System.in);
		int op;
		System.out.println();
		System.out.println( "1) Find two digit numbers <= 56 with sums of digits > 10" );
		System.out.println( "2) Find two digit number minus number reversed which equals sum of digits" );
		System.out.println( "3) Quit" );
		System.out.print( "\n> " );
		op = kb.nextInt();
        return op;
	}

    public static void main(String[] args){
	    int op;
	    while(true){
            op = menu();
            if(op == 1){
                System.out.print("\nAns : ");
                display();
                System.out.println();
            }else if(op == 2){
                System.out.print("\nAns : ");
                NP2();   
            }else if(op ==3){
                break;
            }else{
                System.out.println( "Invalid option. Please try again." );
            }
	    }	
    }
}