package PdfAssignmentTwo;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortAlgorithm {
	

		public static void insertionsort(int[] arr) {
			int size = arr.length;
			
			for(int i = 1; i <= size-1; i++) {
				int key = arr[i];
				int j = i-1;
				while(j >= 0 && arr[j] > key) {
					arr[j+1] = arr[j];
					j--;
				}
				arr[j+1] = key;
			}
		}
		
		public static void main(String [] args) {
			//int[] arr = {5, 6, 12, 3, 1, 8};
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the size of the array");
			int n=sc.nextInt();
			int[] arr = new int[n];
			System.out.println("enter the values for array");
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			InsertionSortAlgorithm is = new InsertionSortAlgorithm();
			is.insertionsort(arr);
			System.out.println("Sorted array is : ");
			System.out.println(Arrays.toString(arr));
		}
	}

