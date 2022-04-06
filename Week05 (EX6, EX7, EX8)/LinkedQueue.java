/*
 * June 3rd 2020
 * Exercise8 :Defining LinkedQueue as a method to use dequeue() and enqueue() to show node through QueueTest.java
 * By Cho keun hee
 */

public class LinkedQueue {
    Node head = null;
    Node tail = null;
    int size = 0;

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
    public String dequeue() {
        if(head == null){
            return null;
        }else{
            String e = head.getElement();
            head = head.getNext();
            size = size - 1 ;
            return e;
        }
    }
    public void enqueue(String e) {
        Node n = new Node(e, null);
        if(tail == null){
            head = n;
        }else{
            tail.setNext(n);
        }
        tail = n;
        size = size + 1;
    }
}