package javaPackage;

import java.util.HashMap;

public class HashMap_Program1 {

	public static void main(String[] args) {

		HashMap<Integer,String> h1 = new HashMap<Integer,String>();
		
		h1.put(2, "Ram");
		h1.put(3, "Sham");
		
		System.out.println(h1);
		
		
		h1.replace(2, "Ravan");
		h1.replace(3, "Sham", "Gone");
		
		System.out.println(h1);
		
		h1.remove(3);
		h1.remove(2);
		
		System.out.println(h1);
		
		h1.put(2,"poi");
		System.out.println(h1);

		
	}

}
