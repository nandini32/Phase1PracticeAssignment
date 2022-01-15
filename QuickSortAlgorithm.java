
package PdfAssignmentTwo;

/**
 * @author Nandini_Gorkal
 *
 */
import java.util.Arrays;
import java.util.Scanner;


public class QuickSortAlgorithm {

	       static int partition(int [] arr, int left, int right) {
	    	   int pivot = arr[right];
	    	   int i = left - 1;
	    	
	    	   for(int j = left; j < right; j++) {
	    		   if(arr[j] <= pivot) {
	    			   i++;
	    			   
	    			   int temp = arr[i];
	    			   arr[i] = arr[j];
	    			   arr[j] = temp;
	    		   }
	    	   }
	    	   
	    	   int temp = arr[i+1];
	    	   arr[i+1] = arr[right];
	    	   arr[right] = arr[temp];
	    	   
	    	   return(i+1);
	       }
	       
	       static void quickSort(int[] arr, int left, int right) {
	    	   if(left < right) {
	    		   int part = partition(arr, left, right);
	    		   quickSort(arr, left, part-1);
	    		   quickSort(arr, part+1, right);
	    	   }
	       }
	       
	       public static void main(String [] args) {
	    	   Scanner sc = new Scanner(System.in);
				System.out.println("enter the size of the array");
				int n=sc.nextInt();
				int[] arr = new int[n];
				System.out.println("enter the values for array");
				for(int i=0;i<n;i++) {
					arr[i]=sc.nextInt();
				}
	    	   System.out.println("Unsorted array : ");
	    	   System.out.println(Arrays.toString(arr));
	    	   
	    	   int size = arr.length;
	    	   QuickSortAlgorithm.quickSort(arr, 0, size-1);
	    	   
	    	   System.out.println("Sorted arrays is : ");
	    	   System.out.println(Arrays.toString(arr));
	       }
	}

