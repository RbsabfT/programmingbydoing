public class NumPuzzle2{
	public static void main(String[] args){
	for ( int h = 1; h < 10; h++ ){
			for ( int t = 0; t < 10; t++ ){
				for ( int o = 0; o < 10; o++ ){
					if ( (Math.pow(hundreds, 3) + Math.pow(tens, 3) + Math.pow(ones, 3)) == ( (hundreds * 100) + (tens * 10) + ones) ){ 
						System.out.println( ((hundreds * 100) + (tens * 10) + ones) );
                    }
				}
			}
		}
	}
}