package javaPackage;

public class ForLoop_Program4 {
 // To print sum of even numbers between 1to 100 using for loop
	public static void main(String[] args) {
		int sum=1;
		for (int i = 1; i <= 100;i++)
			if (i%2==0)
		{
			
			sum=sum+i;
				
		
		System.out.println("Sum of Even Number = " +  sum);
		}
		

	}

}
