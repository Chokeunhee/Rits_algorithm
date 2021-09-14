/*
 * June 17th 2020
 * 
 * Exercise 12,13,14 : The base definition of function being used at HeapTest
 * Exercise 12 : showing the heap and calling the position of the parent and child
 * Exercise 13 : showing the heap and calling the upheap
 * Exercise 14 : showing the heap and calling the downheap
 * 
 * By Cho keunhee
 */

import java.util.ArrayList;

public class HeapPriorityQueue {
    ArrayList<Tuple> data = null;
    Tuple tp;

    public HeapPriorityQueue(ArrayList<Tuple> data_) {
        data = data_;
    }
    
    public void showQueue() {
        for (int i = 0; i < data.size(); i++){
            System.out.print("(" + data.get(i).getKey() + "," + data.get(i).getElement() + ")");
        }
        System.out.println();
    }

    public int parent(int j) {
        return (j - 1) / 2;
    }
    
    public int left(int j) {
        return 2 * j + 1;
    }
    
    public int right(int j) {
        return 2 * j + 2;
    }
    
    public int len() {
        return data.size();
    }
    
    public void add(int key, String element) {
        data.add(new Tuple(key, element));
        upheap(data.size() - 1);
    }
    
    public void swap(int i, int j) {
        Tuple t1 = data.get(i);
        Tuple t2 = data.get(j);
        data.set(i, t2);
        data.set(j, t1);
    }
    
    public void upheap(int j) {
        System.out.print("upheap: ");
        showQueue();
        
        int p = parent(j);
        if(data.get(j).getKey() < data.get(p).getKey() && j > 0) {
            swap(j,p);
            upheap(p);
        }
    }
    
    public Tuple remove_min() {
    	
        if (data.isEmpty()){
            return null;
        }
        
        swap(0, data.size() - 1);
        tp = data.get(data.size() - 1);
        data.remove(data.size() - 1);
        downheap(0);
        return tp;
    }
    
    public void downheap(int j) {
        int left, right, small_child;
        
        System.out.print("downheap: ");
        showQueue();
        
        if (left(j) < data.size()) {
            left = left(j);
            small_child = left;
            
            if (right(j) < data.size()){
                right = right(j);
                
                if (data.get(right).getKey() < data.get(left).getKey()){
                    small_child = right;
                }
            }
            
            if (data.get(small_child).getKey() < data.get(j).getKey()){
                swap(j, small_child);
                downheap(small_child);
            }
        }
    }
}

