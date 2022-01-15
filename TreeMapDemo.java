/**
 * @author Nandini Gorkal
 *
 * 12-Jan-2022
 */

package PdfAssignment2;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String, Double> map = new TreeMap<>();
		
		map.put("Shivani", 56000.908);
		map.put("Sanskrithi", 35000.89);
		map.put("Srujana", 75000.89);
		map.put("Bhargavi", 47000.340);
		
		map.forEach((k, v) -> System.out.println("Key: " + k + ", Value : " + v));

	}

}
