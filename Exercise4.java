/*
 * May 27th 2020
 * Exercise4: Using push and pop method of ArrayDeque to modify and display function stack
 * By Cho keunhee
 */

import java.util.ArrayDeque;

public class Exercise4 {

	ArrayDeque<String> stack = new ArrayDeque<String>();
	
	public static void main(String[] args) {
		Exercise4 ex4 = new Exercise4();
		ex4.stackTest();
	}
	

	public void stackTest() {
		
		stack.push("AA");
		
		stack.push("BB");
		
		stack.push("CC");
		
		System.out.println(stack);
		
		System.out.println(stack.pop());
		
		stack.push("DD");
		
		System.out.println(stack);

	}

}
