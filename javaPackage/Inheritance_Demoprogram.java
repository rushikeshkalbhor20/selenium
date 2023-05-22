package javaPackage;

 class colour {
	
	String c="red";
	public void Accept()
	{
		System.out.println("choose a colour");
	
	}
 }
	class Display extends colour
	{
		public void Displayss()
		{
		System.out.println("show colour "+c);
}
}
	
	public class Inheritance_Demoprogram
	{
		public static void main(String args[])
	{
		Display obj = new Display();
		obj.Accept();
		obj.Displayss();
		
	}
}