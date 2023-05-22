package javaPackage;

import java.util.Scanner;


	class Bike
	{
		Scanner Sc = new Scanner(System.in);
		int speedlimitperhour, maxspeed, minspeed, RPM, Cost;
		String Colour,Brand,type;
	
	public void Accept1()
	{
		System.out.println("Enter the type of bike");
		type= Sc.next();
	}
	public void Display1()
	{
		System.out.println("The type of bike seleted is = " + type);
		
	}
	}
	class General extends Bike
	{
		public void Accept2()
		{
			Accept1();
			System.out.println("Enter speed limit per hr");
			speedlimitperhour = Sc.nextInt();
			System.out.println("Enter max speed");
			maxspeed = Sc.nextInt();
			System.out.println("Enter RPM");
			RPM = Sc.nextInt();
			System.out.println("Enter Colour");
			Colour= Sc.next();
			System.out.println("Enter the Brand");
			Brand= Sc.next();
			}
		public void Display2()
		{
			Display1();
			System.out.println("The bike Speed limit per hour = " +speedlimitperhour);
			System.out.println("Bike Max Speed = " +maxspeed);
			System.out.println("The bike RPM is = " +RPM);
			System.out.println("The bike Colour = "+Colour);
			System.out.println("The Brand of the bike = " +Brand);
			
		}
	}
	class Sports extends General
	{
		public void Accept3()
		{
			Accept2();
			System.out.println("Enter the Brand of the Bike");
			Brand = Sc.next();
			System.out.println("Enter the colour of the bike ");
			Colour = Sc.next();
			System.out.println("Enter the cost of the bike");
			Cost = Sc.nextInt();
			System.out.println("Enter the RPM of the bike");
			RPM = Sc.nextInt();
	
		}
		public void Display3()
		{
			Display2();
			System.out.println("The Brand of the bike = " +Brand);
			System.out.println("The colour of the bike = " +Colour);
			System.out.println("The cost of the bike = " +Cost);
			System.out.println("The RPM of the bike = " +RPM);
			}
	}
	public class Inheritance_Program2 {
		public static void main(String[] args)
		{
		Sports s = new Sports();
		s.Accept3();

		s.Display3();
		}
	}

	
	

