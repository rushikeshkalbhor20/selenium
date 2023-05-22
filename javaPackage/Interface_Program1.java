package javaPackage;

interface xyz {

	 void a();
}

	 public class Interface_Program1 implements xyz
	{
		public void a()
		{
			System.out.println("a method");
		}
		public static void main(String[] args) {
			Interface_Program1 i2 = new Interface_Program1();
			i2.a();
		}
	}