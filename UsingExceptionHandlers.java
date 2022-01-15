package ExceptionsHandling;

import java.util.Scanner;

public class UsingExceptionHandlers {

	public static void main(String[] args) {
		
		new UsingExceptionHandlers().Inputdata();
		
	}
void Inputdata() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	int firstnum=sc.nextInt();
	System.out.println("Enter second number");
	int secondnum=sc.nextInt();
	
	//try {
	new UsingExceptionHandlers().divideNumbers(firstnum, secondnum);
//	}
//	catch(ArithmeticException ae) {
//		System.out.println(ae.getMessage());
//	}
    	
}
void divideNumbers(int firstNumber, int secondNumber) {
	int result=firstNumber/secondNumber;
	display(result);
	
}
void display(int result) {

	System.out.println("Division is : "+result);
	
}

}
