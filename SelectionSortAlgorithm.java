package PdfAssignmentTwo;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortAlgorithm {
	    public static void selectionsort(int[] arr) {
	    	int size = arr.length;
	    	
	    	for(int i = 0; i < size-1; i++) {
	    		int min = i;
	    		for(int j = i+1; j < size; j++) {
	    			if(arr[j] < arr[min]) {
	    				min = j;
	    			}
	    		}
	    		int temp = arr[i];
	    		arr[i] = arr[min];
	    		arr[min] = temp;
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
	    	SelectionSortAlgorithm ss = new SelectionSortAlgorithm();
	    	ss.selectionsort(arr);
	    	System.out.println("Sorted Array is : ");
	    	System.out.println(Arrays.toString(arr));
	    }
	}

