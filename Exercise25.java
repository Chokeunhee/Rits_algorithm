/*
 * July 14th 2020
 * Exercise25 : implementing the Knuth-Morris-Pratt algorithm
 * By Cho keunhee
 */

public class Exercise25 {	
		String str1 = "dabdabcabcba"; 
		String str2 = "abcb";
		public static void main(String[] args) { 
			new Exercise25();
		}
		
		public Exercise25() {
			String[] text = str1.split(""); 
			String[] pattern = str2.split(""); 
			printList("text", text); 
			printList("pattern", pattern);
			
			int result = find_kmp(text, pattern);
			System.out.println(result);
		}
		
		public int find_kmp(String[] text, String[] pattern) {
			int n = text.length;
			int m = pattern.length;
			
			/* Complete this part */
			
			if(m == 0) {
				return 0;
			}
			
			int[] fail = compute_kmp_fail(pattern);
			int j = 0;
			int k = 0;
			
			while(j < n) {
				
				System.out.println("k is "+ k + ", text is " + text[j] + ", pattern is " + pattern[k]);
				
				if(text[j].equals(pattern[k])) {
					if(k == m - 1) {
						return j - m + 1;
					}
					j += 1;
					k += 1;
				}
				else if(k > 0) {
					k = fail[k-1];
				}else {
					j += 1;
				}
			}
			return -1;
		}
		
		public int[] compute_kmp_fail(String[] pattern) { 
			int m = pattern.length;
			int[] fail = new int[m];
			int j = 1;
			int k = 0;		
			
			/* Complete this part */
			
			while(j < m) {
				if(pattern[j].equals(pattern[k])) {
					fail[j] = k+1;
					j += 1;
					k += 1;
				} else if( k > 0) {
					k = fail[k-1];
				} else {
					j+= 1;
				}
			}return fail;
		}
		
		public void printList(String str, String[] list) {
			System.out.print(str + ": ");
			for(int i = 0; i < list.length; i++) {
				System.out.print(list[i] + " ");
				}
			System.out.println();
			}		
		}