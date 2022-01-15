 //Write a program to demonstrate different methods of different return types.

package PdfAssignmentTwo;

public class CreatingMethodsWithDifferentReturnTypes {

	public static void main(String[] args) {
		CreatingMethodsWithDifferentReturnTypes obj = new CreatingMethodsWithDifferentReturnTypes();
	    int res=obj.add(2,3);
	    System.out.println("Addition is : "+res);
	     
	    obj.Nothing();
	    obj.character();
	    obj.bool();
	    float divres=obj.div(12, 4);
	    System.out.println("Division is : "+divres);
	    
	
	}
	public void Nothing() {
		System.out.println("Void returns nothing");
	}
	public int add(int a, int b) {
		System.out.println("Returns integer value");
		return a+b;
	}
	public char character() {
		System.out.println("Returns a character");
		return 'c';
	}
    public boolean bool() {
    	System.out.println("Returns a boolean value either true or false");
    	return true;
    }
    public float div(float a,float b) {
    	System.out.println("Returns a Float value");
    	return a/b;
    }
    
    
    
}
