/*
 * July 9th 2020
 * Exercise22 : Quick sorting the list (quick-sort algorithm)
 * By Chokeunhee
 */

import java.util.ArrayDeque;

public class Exercise22 {
	int[] list = {6, 8, 2, 1, 4, 3, 7};
	ArrayDeque<Integer> data = new ArrayDeque<Integer>();
	
	public static void main(String[] args) {
		new Exercise22();
	}
	
	public Exercise22() {
		for(int i = 0; i< list.length; i++) {
			data.add(list[i]);
		}
		System.out.println("original is " + data);
		quickSort(data);
		System.out.println("result is " + data);
	}
	
	public void quickSort(ArrayDeque<Integer> sequence) {
		
		int n = sequence.size();
		if(n < 2) {
			return;
		}
		
		int P = sequence.getFirst();
		ArrayDeque<Integer> L = new ArrayDeque<Integer>();
		ArrayDeque<Integer> E = new ArrayDeque<Integer>();
		ArrayDeque<Integer> G = new ArrayDeque<Integer>();
		
		while (!(sequence.isEmpty())) {
		   if(sequence.getFirst() < P) {
		    L.add(sequence.remove());
		   }
		   else if(P < sequence.getFirst()) {
		    G.add(sequence.remove());
		   }
		   else {
		    E.add(sequence.remove());
		   }
		  }
		  quickSort(L);
		  quickSort(G);
		  while (!(L.isEmpty())) {
		   sequence.add(L.remove());
		  }
		  while (!(E.isEmpty())) {
		    sequence.add(E.remove());
		  }
		  while (!(G.isEmpty())) {
			sequence.add(G.remove());
		  }
		
		
		System.out.println(sequence);
	}

}
