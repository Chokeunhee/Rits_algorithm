/*
 * July 14th 2020
 * Exercise24 : Implementing the Boyer-Moore algorithm
 * By Cho keunhee
 */

import java.util.HashMap;

public class Exercise24 {
	String str1 = "dabdabcabcba";
	String str2 = "abcb";
	
	public static void main(String[] args) {
		new Exercise24();
	}
	
	public Exercise24() {
		String[] text = str1.split("");
		String[] pattern = str2.split("");
		printList("text", text);
		printList("pattern", pattern);
		
		int result = find_boyer_moore(text,pattern);
		System.out.println(result);
	}
	
	public int find_boyer_moore(String[] text, String[] pattern) {
		int n = text.length;
		int m = pattern.length;
		HashMap<String,Integer> last = new HashMap<String, Integer>();
		int j;
		
		if(m == 0) {
			return 0;
		}
		
		for(int k=0; k < m; k++) {
			last.put(pattern[k], k);
		}
		
		int i = m -1;
		int k = m -1;
		
		while(i < n) {
			
			System.out.println("k is "+ k + ", text is " + text[i] + ", pattern is " + pattern[k]);
			if(text[i].equals(pattern[k])) {
				if(k == 0) {
					return i;
				}
				else {
					i -= 1;
					k -= 1;
				}
			}
			else {
				if(last.get(text[i]) == null) {
					j =-1;
				}else {
					j = last.get(text[i]);
				}
				i += m - java.lang.Math.min(k,j+1);
				
				k = m-1;
			}
		} return -1;
	}
	
	public void printList(String str, String[] list) {
		System.out.print(str + ": ");
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}
	
}



