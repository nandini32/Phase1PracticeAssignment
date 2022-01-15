package PdfAssignmentTwo;

import java.util.Scanner;

public class LinearSearchAlgorithm {
	   static int linearSearch(int[] arr, int target) {
		   if(arr.length == 0) {
			   return -1;
		   }
		   
		   for(int i = 0; i < arr.length; i++) {
			   int element = arr[i];
			   if(element == target) {
				   return i;
			   }
		   }
		   return - 1;
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
		System.out.println("enter th element you want to search");
		
           int target=sc.nextInt() ;
		   int ans = linearSearch(arr, target);
		   System.out.println("Element found at index : " + ans);
	   }

	}
