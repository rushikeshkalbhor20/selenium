package javaPackage;

public class Constructor_Program3 {
	
	//Constructor Overloading
	Constructor_Program3()
	{
		System.out.println("No Arg Constructor");
		}
	
	
	Constructor_Program3(int a)
	{
		System.out.println("Int Arg Construtor");
	}
	
	Constructor_Program3(String b)
	{
		System.out.println("String Arg Constructor");
	}
	public static void main(String[] args) {
		
		Constructor_Program3 con3 = new Constructor_Program3();
		Constructor_Program3 con4 = new Constructor_Program3(1);
		Constructor_Program3 con5 = new Constructor_Program3("Hello");

		
	}
}
