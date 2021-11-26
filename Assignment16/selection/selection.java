import java.util.*;

public class selection{
    public static void sort(int[] a){
        int midIndex;
        int n = a.length;

        for(int i=0;i<n-1;i++){
            midIndex = i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[midIndex]){
                    midIndex = j;
                }
            }
            if(midIndex != i){
                swap(a, i, midIndex);
            }
        }
    }

    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i]= a[j];
        a[j] = temp;
    }

    public static void main(String []args){
        Random r = new Random();
		int[] arr = new int[10];
		int i;

		// Fill up the array with random numbers
		for ( i=0; i<arr.length; i++ )
			arr[i] = 1 + r.nextInt(100);

		// Display it
		System.out.print("before: ");
		for ( i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();

		// Sort it
		sort( arr );

		// Display it again to confirm that it's sorted
		System.out.print("after : ");
		for ( i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();
    }
}