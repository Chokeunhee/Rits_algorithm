/*************************************************************************
 * June 2nd, 2020
 * Test program for Queue with a Singly Linked List
 * by H. Ogawa
 *************************************************************************/

public class QueueTest {

	public static void main(String[] args) {
		new QueueTest();
	}
	
	public QueueTest() {
		LinkedQueue lqueue = new LinkedQueue();
		lqueue.enqueue("abe");
		lqueue.enqueue("def");
		lqueue.enqueue("ghi");
		lqueue.showList();
		System.out.println("removed data is " + lqueue.dequeue());
		lqueue.showList();
		lqueue.enqueue("jkl");
		lqueue.showList();
		System.out.println("removed data is " + lqueue.dequeue());
		lqueue.showList();
		System.out.println("removed data is " + lqueue.dequeue());
		lqueue.showList();
		System.out.println("removed data is " + lqueue.dequeue());
		lqueue.showList();
		System.out.println("removed data is " + lqueue.dequeue());
		lqueue.showList();
	}
}
