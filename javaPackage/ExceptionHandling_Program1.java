package javaPackage;

public class ExceptionHandling_Program1 {

	public static void main(String[] args) {
		
		int a = 100, b = 0, z;
		try
		{
			z= a/b;
			System.out.println(z);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
