package javaPackage;

import java.util.Scanner;

public class Scanner_Program1 {

	public static void main(String[] args) {
		
		int n, choice;
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		choice = Sc.nextInt();
		switch(choice)
		{
		case 1: System.out.println("Enter the limit of numbers to print");
				n = Sc.nextInt();
				for (int i=1;i<=n;i++)
				{
					System.out.println(i);
				}
				break;
		
		case 2: System.out.println("Enter the limit of even number to print");
				n=Sc.nextInt();
				for (int i=1;i<=n;i++)
					if (i%2==0)
				{
					System.out.println(i);
				}
				break;
		case 3: System.out.println("Enter the limit of sum of even numbers to print");
				n=Sc.nextInt();
				int sum = 0;
				for (int i=1;i<=n;i++)
					if (i%2==0)
					{
						sum=sum+i;
					}
				System.out.println(sum);
				break;
		case 4: System.out.println("Enter any number to print the table");
				n=Sc.nextInt();
				int a = n;
			
				int b;
				
				for (int i=1;i<=10;i++)
				{
					b=a*i;
					System.out.println(a+ "x" + i + "=" +b );
				}
				break;

		}
	}

}
