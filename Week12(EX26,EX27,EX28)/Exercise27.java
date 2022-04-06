/*
 * July 22,2020
 * Exercise27 : implementing the Depth-first search algorithm
 * By Chokeunhee
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Exercise27 {
	String[] vertices = {"A","B","C","E","F","G","I","J","K"};
	
	public static void main(String[] args) {
		new Exercise27();
	}
	
	public Exercise27() {
		ArrayList<String> discovered = new ArrayList<String>();
		String startNode = "A";
		Graph gf = new Graph(vertices);
		
		gf.addEdge("A", "B");
		gf.addEdge("A", "E");
		gf.addEdge("A", "F");
		gf.addEdge("B", "C");
		gf.addEdge("B", "F");
		gf.addEdge("C", "G");
		gf.addEdge("E", "F");
		gf.addEdge("E", "I");
		gf.addEdge("F", "I");
		gf.addEdge("G", "J");
		gf.addEdge("G", "K");
		gf.addEdge("I", "J");
		gf.addEdge("J", "K");
		
		for(String node:vertices) {
			ArrayList<String> nodes = gf.getNext(node);
			System.out.println(node + " >> " + nodes);
		}
		
		discovered.add(startNode);
		System.out.print(startNode + " ");
		dfs(gf,startNode,discovered);
	}
		public void dfs(Graph gf, String u, ArrayList<String> discovered) {
			ArrayList<String> nodes = gf.getNext(u);
			Iterator<String> iterator = nodes.listIterator();
			while(iterator.hasNext()) {
				
				//Complete this part
				
				String node = iterator.next();
				if(!(discovered.contains(node))) {
					discovered.add(node);
					System.out.print(node + " ");
					dfs(gf, node, discovered);
				}				
				
			}
		}
				
	}
