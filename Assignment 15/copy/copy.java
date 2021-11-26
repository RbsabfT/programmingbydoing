import java.util.*;
public class copy{
	public static void main(String[] args){
		Random r = new Random();
		int x = r.nextInt(100)+1;
		int arr[] = new int[10];
		int arr1[] = new int[10];

        for(int a=0; a<arr.length; a++){
			arr[a] = r.nextInt(100)+1;
		}
		arr1 = arr;

		System.out.print("Array 1: ");
		for(int a=0; a<arr.length; a++){
			System.out.print(arr[a]+"  ");
		}
        System.out.println();
        arr[arr.length - 1] = -7;
        
		System.out.print("Array 2: ");
		for(int b=0; b<arr1.length; b++){
			System.out.print(arr1[b]+"  ");
		}	
	}
}