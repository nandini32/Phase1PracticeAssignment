//. Write a program in Java to create variables with different access modifiers and access these 
//variables in main()

package PdfAssignmentone;

class TestClass{  
    //private variable 
    private int num=100; 
    
    //public variable
    public String s="Hello World..!";
    
    //protected variable
    protected boolean b=true;
    
    //defalut:if nothing is specifiec
    
    String str="This is Default";
    }

public class AccessmodifiersAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass tc=new TestClass();
		 
		//private members cant be accesed in other classes
		//System.out.println(tc.num);
		//it can be only with in the class where it is declared
		System.out.println("This is public\n"+tc.s);
		System.out.println("This is protected\n"+tc.b);
		System.out.println(tc.str);
		
	}

}
