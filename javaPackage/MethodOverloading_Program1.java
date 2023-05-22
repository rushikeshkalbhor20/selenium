package javaPackage;

public class MethodOverloading_Program1 {
	
	int Rollno= 102;
	String Name="xyz";
	String City="pune";
	public void Area()
	{
		System.out.println("Rollno "+" pune "+" xyz");
		}
	public void Area(int Rollno)
	{
		System.out.println(Rollno);
	}
	public void Area(int Rollno,String xyz)
	{
		System.out.println(Rollno +  xyz);
	}
	public void Area(int Rollno, String xyz, String pune)
	{
		System.out.println(Rollno+" " + xyz + " "+pune);
		}
	public static void main(String[] args)
	{
		MethodOverloading_Program1 obj =  new MethodOverloading_Program1();
		obj.Area();
		obj.Area(111);
		obj.Area(111, "xyz");
		obj.Area(111, "xyz", "pune");
	}
}
