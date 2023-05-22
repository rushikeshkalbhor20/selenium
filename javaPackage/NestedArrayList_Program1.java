package javaPackage;

import java.util.ArrayList;

public class NestedArrayList_Program1 {
	public static void main(String args[])
	{
	
	ArrayList<String> L1 = new ArrayList<String>();
	
	ArrayList<ArrayList<String>> L2= new ArrayList<>();
	
	L1.add("name");
	L1.add("b");
	L2.add(L1);
	System.out.println(L2);
	L1 = new ArrayList<String>(); //creating an instance
	L1.add("C");
	L2.add(L1);
	System.out.println(L2);
	
	
	
}
}