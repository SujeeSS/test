package com.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {
	public static void main(String[] args) {
		// map

//	store key-value pairs

//	does not allow duplicate keys, but values can be duplicated.

		HashMap<Integer, String> stud = new HashMap();

		stud.put(101, "sri");

		stud.put(102, "sujee");

		stud.put(103, "pragadeesh");

		stud.put(104, "saro");

		System.out.println(stud);

		System.out.println(stud.get(101));

		System.out.println(stud.containsKey(101));

		System.out.println(stud.containsValue("sri"));
		
		

		stud.remove(104);

		stud.remove(101, "chjdsk");

		System.out.println(stud);

		stud.replace(101, "sri vignesh");

		System.out.println(stud);
		stud.putIfAbsent(104, "saro");
		System.out.println("---"+stud.entrySet());

		
		for(Map.Entry<Integer, String> a :stud.entrySet()) {
			
			System.out.println(a.getKey()+"--"+a.getValue());
			
		}
		
	}
}
