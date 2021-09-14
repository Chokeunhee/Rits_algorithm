/*
 * July 22,2020
 * Exercise26 : displaying each of the vertex and the connection
 * By Chokeunhee
 */

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
	HashMap<String,ArrayList<String>> vertex = new HashMap<String,ArrayList<String>>();
	
	public Graph(String[] nodes) {
		for(String node:nodes) {
			vertex.put(node, new ArrayList<String>());
		}
	}
	public void addEdge(String v, String w) {
		
		//Complete this part
		
		vertex.get(v).add(w);
		vertex.get(w).add(v);
		
	}
	
	public ArrayList<String> getNext(String node){
		
		//Complete this part
		
		return vertex.get(node);
		
	}


}

