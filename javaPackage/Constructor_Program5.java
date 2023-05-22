package javaPackage;

public class Constructor_Program5 {
float x;
int y;
String z;
	Constructor_Program5(float x, int y, String z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
		System.out.println(x+ "  "+ y +"  " +z);
		
	}
	public static void main(String[] args) {
		
		Constructor_Program5 c5 = new Constructor_Program5(122.1f,51,"rushi");
	}
}
