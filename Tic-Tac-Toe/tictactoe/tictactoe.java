import java.util.Scanner;

public class tictactoe{
	private static char[][] board = new char[3][3];

	public static void main( String[] args ){

		initBoard();
		displayBoard();

        char p1 = 'x';
        char p2 = 'O';
        int turn = 1;

        while(true){
            if(turn%2!=0){
                playC(p1);
                turn++;
            }else{
                playC(p2);
                turn++;
            }
            displayBoard();

            if(winGame(p1)){
                System.out.println()
            }
        }

	}

	public static void initBoard(){
		// fills up the board with blanks
		for ( int r=0; r<3; r++ )
			for ( int c=0; c<3; c++ )
				board[r][c] = ' ';
	}


	public static void displayBoard(){
		System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("    --+-+--");
		System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("    --+-+--");
		System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
		System.out.println("     0 1 2 ");
	}


	public static void displayBoard2(){
		for ( int r=0; r<3; r++ )
		{
			System.out.print("\t"+r+" ");
			for ( int c=0; c<3; c++ )
			{
				System.out.print( board[r][c] + " " );
			}
			System.out.println();
		}
		System.out.println("\t  0 1 2 ");
	}

    public static void playC(char p){
        Scanner I = new Scanner(System.in);
        int r,c;
        while(true){
            System.out.print("Choose your location(row, column): ");
            r = I.nextInt();
            c = I.nextInt();
            if(r<3 && c<3 || r>-1 && c>-1){
                break;
            }else{
                System.out.println("Out of range");
            }
        }
        board[r][c] = p;
    }

    public static boolean winGame(char p){
        for(int i = 0;i<3;i++){
            if(p == board[i][0] && board[i][0] == board[i][1] && board[i][1] == board[i][2])
            return true;
        }

        for(int j=0;j<3;j++){
            if(p == board[0][j] && board[0][j] == board[1][j] && board[1][j] == board[2][j])
            return true;
        }

        if(p == board[0][0] && board[0][0] == board[1][1] && board[1][1] == board[2][2])
            return true;
        
        if(p == board[0][2] && board[0][2] == board[1][1] && board[1][1] == board[2][0])
            return true;
        
        return false;
    }
}

