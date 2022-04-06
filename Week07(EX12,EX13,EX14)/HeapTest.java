import java.util.ArrayList;

public class HeapTest{
	
	ArrayList<Tuple> data = new ArrayList<Tuple>();

	public static void main(String[] args) {
		HeapTest ht = new HeapTest();
		//ht.ex12();
		//ht.ex13();
		//ht.ex14();
	}
	
	public void ex12() {
		data = setData();
		HeapPriorityQueue hpq = new HeapPriorityQueue(data);
		hpq.showQueue();
		System.out.println("the parent of position 4 is position " + hpq.parent(4));
		System.out.println("the left node of position 1 is position " + hpq.left(1));
		System.out.println("the right node of position 1 is position " + hpq.right(1));
		System.out.println("the size of Heap is " + hpq.len());
	}
	
	public void ex13() {
		data = setData();
		HeapPriorityQueue hpq = new HeapPriorityQueue(data);
		System.out.println("The first situation of heap is");
		hpq.showQueue();
		hpq.add(2, "T");
		System.out.println("The last situation of heap is");
		hpq.showQueue();
	}
	
	public void ex14() {
		data = setData();
		HeapPriorityQueue hpq = new HeapPriorityQueue(data);
		System.out.println("The first situation of heap is");
		hpq.showQueue();
		Tuple tu = hpq.remove_min();
		if(tu != null) {
			System.out.println("(" + tu.getKey() + ", " + tu.getElement() + ") is removed");
		}
		System.out.println("The last situation of heap is");
		hpq.showQueue();
	}
	
	public ArrayList<Tuple> setData(){
		ArrayList<Tuple> data = new ArrayList<Tuple>();
		data.add(new Tuple(4, "C"));
		data.add(new Tuple(5, "A"));
		data.add(new Tuple(6, "Z"));
		data.add(new Tuple(15, "K"));
		data.add(new Tuple(9, "F"));
		data.add(new Tuple(7, "Q"));
		data.add(new Tuple(20, "B"));
		data.add(new Tuple(16, "X"));
		data.add(new Tuple(25, "J"));
		data.add(new Tuple(14, "E"));
		data.add(new Tuple(12, "H"));
		data.add(new Tuple(11, "S"));
		data.add(new Tuple(13, "W"));
		return data;
	}

}
