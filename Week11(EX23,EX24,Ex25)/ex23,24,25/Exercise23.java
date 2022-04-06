/*
 * July 14th 2020
 * Exercise23 : Implementing the brute-force pattern matching algorithm
 * By Cho keunhee
 */

public class Exercise23 {
	String str1 = "dabdabcabcba";
	String str2 = "abcb";

	public static void main(String[] args) {
		new Exercise23();
	}
	
	public Exercise23() {
		String[] text = str1.split("");
		String[] pattern = str2.split("");
		printList("text", text);
		printList("pattern", pattern);
		
		int result = find_brute(text, pattern);
		System.out.println(result);
	}
	
	public int find_brute(String[] text, String[] pattern) {
		int n = text.length;
		int m = pattern.length;
		int k;
		
		// Complete this part
		
		for(int i = 0; i < n-m+1; i++) {
			k = 0;
			while(k < m && text[i+k].equals(pattern[k])) {
				System.out.println("k is "+k+", text is "+text[i + k]+", pattern is "+ pattern[k]);
				k += 1 ;
			}
			if(k == m) {
				return i;
			}
		}
		return -1;
		
	}
	
	public void printList(String str, String[] list) {
		System.out.print(str + ": ");
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}
}
