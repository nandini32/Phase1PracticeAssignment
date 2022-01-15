/**
 * @Nandini Gorkal
 *
 */

package PdfAssignment2;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		//list.add(780);
		
		list.add(4367);
		list.add(33);
		list.add(178);
		list.add(2728);
		
		list.addFirst(1);
		
		list.addLast(898);
		
		//list.add(false);
		
		
		
		list.add(3783);
		
		System.out.println("Size of list : " + list.size());
		//list.add(56.90);
		
		list.removeFirst();
		
		System.out.println("Now size : " + list.size());
		
		
		System.out.println("Value at index 2 is : " + list.get(2));
		
		System.out.println("List : " + list);
		
		list.remove(1);
		
		System.out.println("After deleting one object, list size :" +  list.size());
		
		System.out.println("List now looks like : " + list);
		

		System.out.println("-------------------");
		
		System.out.println("Values in list : ");


	}

}
