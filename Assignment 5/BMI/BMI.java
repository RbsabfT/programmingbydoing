import java.util.Scanner;
public class BMI{
    public static void main(String[] args){
        Scanner I = new Scanner(System.in);
        System.out.print("Your height in m: ");
        float height = I.nextFloat();
        System.out.print("Your weight in kg: ");
        float weight = I.nextFloat();
        float BMI = (weight/(height*height));
        System.out.println("Your BMI is "+BMI);
        if(BMI<15.0){
            System.out.println("BMI Category: very severely underweight");
        }else if(BMI>=15.0 && BMI<=16.0){
            System.out.println("BMI Category: severely underweigh"); 
        }else if(BMI>=16.1 && BMI<=18.4){
            System.out.println("BMI Category: underweight");
        }else if(BMI>=18.5 && BMI<=24.9){
            System.out.println("BMI Category: normal weight");
        }else if(BMI>=25.0 && BMI<=29.9){
            System.out.println("BMI Category: over weight");
        }else if(BMI>=30.0 && BMI<=34.9){
            System.out.println("BMI Category: moderately obese");
        }else if(BMI>=35.0 && BMI<=39.9){
            System.out.println("BMI Category: severaly obese");
        }else if(BMI>=40){
            System.out.println("BMI Category: very severely obese");
        }
    }
}