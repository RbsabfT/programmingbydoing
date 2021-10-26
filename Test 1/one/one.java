import java.util.Scanner;
public class one{
	public static void main(String[] args) {
	    Scanner input= new Scanner(System.in);
	    int year;
        String month;
        int day;
        int mm=0;

	    do{
	        System.out.print("Enter the Year: ");
	        year = input.nextInt();
	    }while(year<0 || year>2021);
	  
	        System.out.print("Enter the Month: ");
            month = input.next();
        
        while(true){
            System.out.print("Enter the Month: ");
            month = input.next();
	        try{
                mm = Integer.parseInt(month);
                if(mm>0 && mm<13){
                break;
                }
            }
	        catch (NumberFormatException e){}
	    }

        
	    do{
	        System.out.print("Enter the Day: ");
	        day = input.nextInt();
	    }while(day<0 || day>30);
	    
	    System.out.println("Your Birthday is "+year+"/"+month+"/"+day);
	
    }
}
