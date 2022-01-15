package PdfAssignmentTwo;

import java.util.Scanner;

public class BinarySearchAlgorithmProgram {
		static int binarySearch(int[] arr, int target) {
			int start = 0;
			int end = arr.length - 1;
			
			while(start <= end) {
				int mid = start + (end - start) / 2;
				
				if(target < arr[mid]) {
					end = mid - 1;
				}
				else if(target > arr[mid]) {
					start = mid + 1;
				}
				else {
					return mid;
				}
			}
			return -1;
		}
		
		public static void main(String [] args) {Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter the values for array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter th element you want to search");
		
            int target=sc.nextInt() ;
			
			int ans = binarySearch(arr, target);
			System.out.println("Element found at index : " + ans);
		}

	}

