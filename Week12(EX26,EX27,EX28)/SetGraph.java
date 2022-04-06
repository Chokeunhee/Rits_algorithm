import java.util.ArrayList;

public class SetGraph {
	String[] vertices= {"A", "B", "C", "E", "F", "G", "I", "J", "K"};

	public static void main(String[] args) {
		new SetGraph();
	}
	
	public SetGraph() {
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
		
		for(String node: vertices) {
			ArrayList<String> nodes = gf.getNext(node);
			System.out.println(node + " >> " + nodes);
		}
	}

}
