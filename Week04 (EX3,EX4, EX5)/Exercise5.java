/*
 * May 27th 2020
 * Exercise5: Using check method to check through array for pairs of matching delimiters
 * By Cho keunhee
 */

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Exercise5 {
	ArrayDeque<Character> deque = new ArrayDeque<Character>();
	ArrayList<Character> left = new ArrayList<Character>();
	ArrayList<Character> right = new ArrayList<Character>();

	public static void main(String[] args) {
		Exercise5 ex5 = new Exercise5();
		ex5.check("(){([()])}");
		ex5.check("([()])}");
		
	}

	public Exercise5() {
		left.add('(');
		left.add('{');
		left.add('[');
		
		right.add(')');
		right.add('}');
		right.add(']');
		
	}
	
	public void check(String str) {
		char[] expr = str.toCharArray();
		if(is_matched(expr)) {
			System.out.println("Correct: " + str);
		} else {
			System.out.println("Incorrect: "+ str);
		}
	}
	
	public boolean is_matched(char[] expr) {
		

		for(char c: expr) {
			
			if(left.contains(c)) {
				
				deque.push(c);
			
			} else if(right.contains(c)) {
				
				if(deque.isEmpty()) {
					
					return false;
				
				}
				
				if(right.indexOf(c) != left.indexOf(deque.pop())) {
				
					return false;
				}
			}
			
		} return deque.isEmpty();
		
	}
		
}

