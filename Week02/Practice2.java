/* 
 * May 13th 2020
 * Making a fratorial function and showing from 0! to 10!
 * By Cho keunhee
 */

public class Practice2 {

	public static void main(String[] args) {
		new Practice2();
	}
	
	public Practice2() {
		for(int i = 0; i< 11; i++) {
			System.out.println(i + "! = " + factorial(i));
		}
	}
	
	public int factorial(int n) {
		int x;
		
		if(n == 0) {
			x = 1;
		}
		else {
			x = n*factorial(n-1);
		}
		return x;		
	}
	

}
