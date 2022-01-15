//Write a program which will take a string as input and will convert it into other primitive data 
//types.
//The eight primitives defined in Java are int, byte, short, long, float, double, boolean, and char 
package PdfAssignmentone;

import java.util.Scanner;

public class TypeConversionAssignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the type in which you want to convert");
		String type=sc.nextLine();
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		  
		switch(type) {
		
		case "integer" :
		//Converting String to int
		int i= Integer.valueOf(s);
		System.out.println(i);
		break;
		
		case "byte" :
		//Converting to byte
		byte b=Byte.valueOf(s);
		System.out.println(b);
		break;
		
		case "short":
		//Converting to short
		short sh=Short.valueOf(s);
		System.out.println(sh);
		break;
		
		
		case "long":
		//Converting to long
		long l=Long.valueOf(s);
		System.out.println(l);
		break;
		
		case "float":
		//Converting to float
		float f=Float.valueOf(s);
		System.out.println(f);
        break;
		
		
		case "double":
		//Converting to double
		double d=Double.valueOf(s);
		System.out.println(d);
        break;
		
		
		case "boolean":
		//Converting to Boolean
		boolean bo=Boolean.valueOf(s);
		System.out.println(bo);
        break;
		
		
		case "char":
		//Converting to char
		char[] ch= s.toCharArray();
		System.out.println(ch);
		break;
		
		default:
			System.out.println("enter  valid datatype");
		
		
		}
		
		
	}

}
