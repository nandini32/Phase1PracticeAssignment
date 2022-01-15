//Write a program in Java to create a constructor
//default,parameterized and overloading all are included in below program
package PdfAssignmentTwo;

public class ConstructorsProgram {

	ConstructorsProgram(){
		System.out.println("This is a default Constructor");
	}
	ConstructorsProgram(String str){
		System.out.println(str);
	}
	public static void main(String[] args) {
		ConstructorsProgram cp=new ConstructorsProgram();
		ConstructorsProgram cp1=new ConstructorsProgram("This is Parameterized Constructor");
		
	}

}
