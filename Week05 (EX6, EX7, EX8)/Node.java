/*************************************************************************
 * June 2nd, 2020
 * Node for linked lists
 * by Ogawa
 *************************************************************************/

public class Node{
	String element;
	Node next;
		
	// constructor of Node
	// e: element, n: next node (null if no next node)
	public Node(String e, Node n) {
		element = e;
		next = n;
	}
	
	// return element
	public String getElement() {
		return element;
	}
	
	// return next node
	Node getNext(){
		return next;
	}
	
	// set node to next
	public void setNext(Node n) {
		next = n;
	}
}
