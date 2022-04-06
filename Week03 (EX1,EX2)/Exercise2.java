/*
 * May 19th 2020
 * Developed from Ex1 and using Iterator to remove "green" from the array
 * By Cho keunhee
 */

import java.util.ArrayList;
import java.util.Iterator;


public class Exercise2 {

	String[] colorData = {"yellow","blue","red","yellow","green",
			"red","yellow","red","green","blue","blue","yellow","blue",
			"red","green","red","yellow","blue","green","red","yellow",
			"blue","red","green","yellow","green","yellow","red"};
	
	ArrayList<String> colors = new ArrayList<String>();

	public static void main(String[] args) {
		Exercise2 ex2 = new Exercise2();
	}
	
	public Exercise2() {
		for(int i = 0; i < colorData.length; i++) {
			colors.add(colorData[i]);
		}
		showPosition("blue");
		showPosition("green");
		showPosition("red");
		showPosition("yellow");
		deleteColor("green");
		showPosition("blue");
		showPosition("green");
		showPosition("red");
		showPosition("yellow");
	}
	
	public void deleteColor(String color) {
		Iterator<String> iterator = colors.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().equals("green"))
				iterator.remove();
		}
		System.out.println(color + " was deleted from colors");
		
	}
	
	public void showPosition(String color) {
		System.out.print(color + " is at ");
		for(int i = 0; i < colors.size(); i++) {
			if(colors.get(i).equals(color)) {
				System.out.print( i + " ");
				}
		}
		System.out.println(" ");
	}
}
