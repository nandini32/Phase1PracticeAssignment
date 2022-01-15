
package PdfAssignmentTwo;

import java.util.Scanner;

/**
 * @author Nandini_Gorkal
 *
 */
public class BubbleSortAlgorihtm {

	public static void bubblesort(int [] arr) {
		int len = arr.length;
		int temp = 0;
		
		for(int i = 0; i <= len; i++) {
			for(int j = 0; j < len-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
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
		bubblesort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

