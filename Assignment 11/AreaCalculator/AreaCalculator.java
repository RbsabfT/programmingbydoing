import java.util.Scanner;

public class AreaCalculator{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        while(true){
            System.out.println("1) Triangle\n2) Rectangle\n3) Square\n4) Circle\n5) Quit");
            System.out.println("Which shape");
            int u=input.nextInt();
            if (u==1){
                System.out.println("Base:");
                int b=input.nextInt();
                System.out.println("Height:");
                int h=input.nextInt();
                System.out.println("The area is "+area_triangle(b,h)+".");
            } else if(u==2){
                System.out.println("Base:");
                int l=input.nextInt();
                System.out.println("Height:");
                int w=input.nextInt();
                System.out.println("The area is "+area_rectangle(l,w)+".");
            } else if(u==3){
                System.out.println("Side:");
                int s=input.nextInt();
                System.out.println("The area is "+area_square(s)+".");

            } else if(u==4){
                System.out.println("Side:");
                int r=input.nextInt();
                System.out.println("The area is "+area_circle(r)+".");
            } else if(u==5){
                break;
            }
        }
    }


    public static double area_triangle( int base, int height ) {
        return base*height/2;                                                      
    }

    public static int area_square( int side ) {
        return side*side;
    }

    public static double area_circle( int radius ) {
        return Math.PI*radius*radius;
    }
        
    public static int area_rectangle( int length, int width ) {
        return length*width;
    }
}