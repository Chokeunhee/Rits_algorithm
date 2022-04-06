/*
 * June 25th 2020
 * 
 * Exercise 15,16,17 : The base definition of function being used at MapTest.java
 * Exercise 15 : Showing map and its value
 * Exercise 16 : Showing size of the map and setting value
 * Exercise 17 : Using get and pop to modify the value of the map
 * 
 * By Cho Keunhee
 * 
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TableMap {
	HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
	
	public TableMap(HashMap<String, Integer> hashmap_) {
		hashmap = hashmap_;
	}
	
	public void showMap() {									
		String key;
		
		int x;												
		Set<String> s = hashmap.keySet();					
		Iterator<String> i = s.iterator();					
		
		while(i.hasNext()) {								
			key = i.next();									
			x = hashmap.get(key);							
			System.out.print(key + ":" + x + " ");			
		}
		System.out.println();
	}
	
	public int len() {
		return 	hashmap.size();
	}
	
	public void set(String key, int value) {
		
		if(hashmap.containsKey(key)) {
			hashmap.replace(key, value);
		}else {
			hashmap.put(key,value);
		}
	}
	
	public int get(String key) {
		return hashmap.get(key);
	}
	
	public int pop(String key) {
		return hashmap.remove(key);
	}
}
