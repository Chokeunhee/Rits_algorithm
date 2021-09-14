/*
 * July 22,2020
 * Exercise28 : implementing the breadth-first search algorithm
 * By Chokeunhee
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Exercise28 {
	String[] vertices = {"A","B","C","E","F","G","I","J","K"};
	
	public static void main(String[] args) {
		new Exercise28();
	}
	
	public Exercise28() {
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
		bfs(gf,startNode,discovered);
	}
	
	public void bfs(Graph gf, String u, ArrayList<String> discovered) {
		ArrayList<String> level = new ArrayList<String>();
		String vertex;
		
		//Complete this part
		
		level.add(u);
		while(level.size() > 0) {
			System.out.println(level);
			ArrayList<String> next_level = new ArrayList<String>();
			Iterator<String> iteratorL = level.iterator();
			while(iteratorL.hasNext()) {
				ArrayList<String> nodes = gf.getNext(iteratorL.next());
				Iterator<String> iteratorN = nodes.iterator();
				while(iteratorN.hasNext()) {
					vertex = iteratorN.next();
					if(!(discovered.contains(vertex))) {
						discovered.add(vertex);
						next_level.add(vertex);
					}
				}
			} 
			level = next_level;
		}

	}
}
	
	
	
	
	
	
	
	
	
