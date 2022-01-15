package PdfAssignmentTwo;

	import java.util.Arrays;
import java.util.Scanner;

	public class ExponentialSearchProgram {
		static int exponentialSearch(int arr[], int n, int x) {

	          if (arr[0] == x)
	             return 0;

	      int i = 1;
	      while (i < n && arr[i] <= x)
	      i = i*2;

	    return Arrays.binarySearch(arr, i/2,
	         Math.min(i, n-1), x);
	  }


	    public static void main(String args[]) {
	    	Scanner sc = new Scanner(System.in);
			System.out.println("enter the size of the array");
			int n=sc.nextInt();
			int[] arr = new int[n];
			System.out.println("enter the values for array");
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("enter th element you want to search");
			
	    int x=sc.nextInt() ;
	    int result = exponentialSearch(arr,
	             arr.length, x);

	     System.out.println((result < 0) ?
	    "Element is not present in array" :
	    "Element is present at index " +
	        result);
	     }
	}

