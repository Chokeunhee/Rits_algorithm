/*
 * June 3rd 2020
 * Exercise6 : Using Node.java to display Nodes
 * By Cho keun hee
 */

public class Exercise6 {
	
	String[] data = {"AA", "BB", "CC", "DD"};
	Node head;
	Node node;
	
	public static void main(String[] args) { 
		new Exercise6();
	}
	
	public Exercise6() {
		node = new Node(data[data.length - 1], null);
		showList(node);
		for(int i = data.length - 2; i >= 1; i--) {
			node = new Node(data[i], node);
			showList(node); 
		}
		
		head = new Node(data[0], node);
		showList(head);
	}
	
	public void showList(Node node) { 
		if(node == null) {
			System.out.println();
		}else {
		System.out.print(node.getElement() +" ");
		showList(node.getNext());
			}
		}
	}