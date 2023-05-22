package javaPackage;

import java.util.HashMap;

public class NestedHashMap_Program1 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> h1 = new HashMap<String, Integer>();
		HashMap<String, HashMap> h2 = new HashMap<String, HashMap>();
		
		h1.put("English",35);
		h1.put("Maths", 45);
		h2.put("Ram", h1);
		System.out.println(h2);
				
		h1 = new HashMap<String, Integer>();
		h1.put("History",46);
		h1.put("Geography",50);
		h2.put("Sham", h1);
		
		System.out.println(h2);
	}

}
