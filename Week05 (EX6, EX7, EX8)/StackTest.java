/*************************************************************************
 * June 2nd, 2020
 * Test program for Stack with a Singly Linked List
 * by H. Ogawa
 *************************************************************************/

public class StackTest {

	public static void main(String[] args) {
		new StackTest();
	}
	
	public StackTest() {
		LinkedStack lstack = new LinkedStack();
		lstack.push("abe");
		lstack.push("def");
		lstack.push("ghi");
		lstack.showList();
		System.out.println("removed data is " + lstack.pop());
		lstack.showList();
		lstack.push("jkl");
		lstack.showList();
		System.out.println("removed data is " + lstack.pop());
		lstack.showList();
		System.out.println("removed data is " + lstack.pop());
		lstack.showList();
		System.out.println("removed data is " + lstack.pop());
		lstack.showList();
		System.out.println("removed data is " + lstack.pop());
		lstack.showList();
	}
}
