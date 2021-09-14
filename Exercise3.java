/*
 * May 27th 2020
 * Exercise3: Using addLast method of ArrayDeque to "enqueue" and removeFirst method to "dequeue" and show result
 * By Cho keunhee
 */


import java.util.ArrayDeque;

public class Exercise3 {

	ArrayDeque<String> queue = new ArrayDeque<String>();
	
	public static void main(String[] args) {
		Exercise3 ex3 = new Exercise3();
		ex3.queueTest();
	}
	

	public void queueTest() {
		
		queue.addLast("AA");
		
		queue.addLast("BB");
		
		queue.addLast("CC");
		
		queue.addLast("DD");
		
		System.out.println(queue);
		
		System.out.println(queue.removeFirst());
		
		queue.addLast("EE");
		
		System.out.println(queue);
	}

}