package javaPackage;

import java.util.Scanner;

	
	class media
	{
		Scanner Sc = new Scanner(System.in);
		String Media,url, type;
		int price,id,costprice,sellprice,percent;
		public void Accept()
		{
			System.out.println("Enter the type of Media you want");
			Media = Sc.next();
		}
		public void Display()
		{
			System.out.println("You have selected = " + Media);
		}
	}
	class online extends media
	{
		public void Accept1()
		{
			Accept();
			System.out.println("Enter Url of the Media");
			url = Sc.next();
			System.out.println("Enter id of the Media");
			id = Sc.nextInt();
			System.out.println("Enter price of the Media");
			price = Sc.nextInt();
		}
		public void Diplay1()
		{
			Display();
			System.out.println("The URL of the Media = " +url);
			System.out.println("The ID of the Media = " +id);
			System.out.println("The Price of the Media = " +price);
		}
	}
	class offline extends media
	{
		public void Accept2()
		{
			Accept();
			System.out.println("Enter id of the Media");
			id = Sc.nextInt();
			System.out.println("Enter the name of Media");
			type = Sc.next();
			System.out.println("Enter the costprice of the Media");
			costprice = Sc.nextInt();
			System.out.println("Enter the sellprice of the Media");
			sellprice = Sc.nextInt();
		}
		public void Display2()
		{
			Display();
			System.out.println("The ID of the Media = " +id);
			System.out.println("The name of the Media = " +type);
			System.out.println("The costprice of the Media = " +costprice);
			System.out.println("The sellprice of the Media = " +sellprice);
		}
	
		public void Calculate()
		{
			if (costprice>sellprice)
			{
				System.out.println("Loss = " +(costprice-sellprice));

			}
			else if (costprice<sellprice)
			{
				System.out.println("Profit = " + (sellprice-costprice));
			}
			else
			{
				System.out.println("No profit/No loss");
			}
			}
	}
		public class Inheritance_Program4 {
			
			public static void main(String[] args)
			{
				
				
				offline O = new offline();
				O.Accept2();
				O.Display2();
				O.Calculate();
				online N = new online();
				N.Accept1();
				N.Diplay1();
			}
			}
		
		



