package PdfAssignmentTwo;

import java.util.Arrays;
import java.util.Scanner;

public class OrderStatitics {
	public static int kthSmallest(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[k - 1];
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
		System.out.println("enter the value of k");
		int k = sc.nextInt();
		System.out.println("Kth Smallest element is : " + kthSmallest(arr, k));
	}
}
