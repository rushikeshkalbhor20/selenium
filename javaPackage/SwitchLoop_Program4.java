package javaPackage;

public class SwitchLoop_Program4 {

	public static void main(String[] args) {
		
		int sum=0;
		int choice = 3;
		if (choice>5)
		{
			System.err.println("Invalid Choice");
		}
		switch(choice)
		{
		case 1: System.out.println("Printing numbers 1 to 10");
				for (int i=1;i<=10;i++)
				{
					System.out.println(i);
				}
				break;
		
		case 2: System.out.println("Printing even numbers");
				for (int i=1;i<=10;i++)
					if (i%2==0)
					{
					System.out.println(i);
					}
				break;
		case 3: System.out.println("Printing sum of even numbers");
				for (int i=1;i<=10;i++)
				if (i%2==0)
			{
					sum=sum+i;
					System.out.println(sum);
			}
				break;
		case 4:	System.out.println("Printing table of 5");
				int b;
				int a = 5;
				for (int i=1;i<=10;i++)
		{
					b=a*i;
					System.out.println(a + "x" + i + "=" +b);
					}
				break;
				
		}
	}

}
	

