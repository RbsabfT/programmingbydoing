import java.io.*;
import java.util.*;
public class whereisit{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int a[] = new int[10];
		int point=0;
		boolean found=false;
		System.out.print("Array: ");
		for(int i=0; i<a.length; i++){
			a[i]=1+r.nextInt(50);
			System.out.print(a[i]+"  ");
		}
		System.out.print("\nValue to find: ");
		int value = keyboard.nextInt();
		for(int j=0; j<a.length; j++){
			if(a[j]==value && !found){
				point=j;
				found=true;
			}
		}System.out.println();
		if(found){
			System.out.println(value+" is in point "+point+".");
		}else{
			System.out.println(value+" is not in the array.");
		}
	}
}