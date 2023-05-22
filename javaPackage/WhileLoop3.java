package javaPackage;

public class WhileLoop3 {

	public static void main(String[] args) {

		int i = 10; //Local variable
		
		while(i < 20 & i < 12)
		{
			System.out.println(i);
			i++;  //if we forget to pass incr/decr, program will execute till infinite
		}
	}

}
