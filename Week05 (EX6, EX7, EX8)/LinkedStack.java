/*
 * June 3rd 2020
 * Exercise7 : Defining LinkedStack as a method to use push() and pop() to show node through StackTest.java
 * By Cho keun hee
 */

public class LinkedStack {
	Node head = null;
	
	//to display a singly linked list
	public void showList() {
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

	
	public void push(String e){
		if(head == null) {
			head = new Node(e, null);
		}else{
			Node a = new Node(e, null);
			a.setNext(head);
			head = a;
		}
	}
	
	public String pop() {
		 if(head == null){
	         return null;
	     }else{
	         String b = head.getElement();
	         head = head.getNext();
	         return b;
	       }
		}
	}