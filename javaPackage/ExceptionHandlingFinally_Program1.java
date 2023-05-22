package javaPackage;

public class ExceptionHandlingFinally_Program1 {

	public static void main(String[] args) {
		
		try
		{
			System.out.println("Inside the try box");
			
			int data= 25/0;
			System.out.println(data);			
		}
		
		catch(NullPointerException e)
		{
	        System.out.println(e);    

		}
		
		finally
		{
			System.out.println("finally block is always executed");
			
		}
		System.out.println("rest of code.. ");
	}
	
}
