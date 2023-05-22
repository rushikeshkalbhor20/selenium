package javaPackage;

public class ExceptionHandling_Program2 {

	public static void main(String[] args) {

		int a = 5;
		int b = 0;	
		int data;
		
		try
		{
			data=a/b; //may through Exception
			
		}
		catch(Exception e)
		{
			System.out.println(a/(b+2));
			
		}
		}

}
