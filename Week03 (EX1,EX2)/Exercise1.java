/*
 * May 19th 2020
 * Using equals method to check string inside of array and display its position 
 * By Cho keunhee
 */

import java.util.ArrayList;

public class Exercise1 {
	
	String[] colorData = {"yellow","blue","red","yellow","green",
			"red","yellow","red","green","blue","blue","yellow","blue",
			"red","green","red","yellow","blue","green","red","yellow",
			"blue","red","green","yellow","green","yellow","red"};
	
	ArrayList<String> colors = new ArrayList<String>();

	public static void main(String[] args) {
		Exercise1 ex1 = new Exercise1();
	}
	
	public Exercise1() {
		for(int i = 0; i < colorData.length; i++) {
			colors.add(colorData[i]);
		}
		showPosition("blue");
		showPosition("green");
		showPosition("red");
		showPosition("yellow");
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
