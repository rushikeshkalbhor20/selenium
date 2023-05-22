package javaPackage;

public class NestedIfElse_statement {
	
	public static void main(String[] args)
	{
		int age = 25; //local variable
		int weight = 55; //local variable
		
		//outer if block
		if (age > 18)
		{
			//inner if block
			if (weight > 50)
			{
				System.out.println("Eligible");
				
			}
			else
			{
				System.out.println("Not Eligible");
			}
		}
		else
		{
			System.out.println("Age is not greater than 18");
		}
	}
}
