/* comments */

public class Exercise20 {
	int[] list1 = {2, 5, 8};
	int[] list2 = {1, 4, 7, 9};
	int[] list3 = {6, 8, 2, 1, 5, 3, 7}; // data for Exercise21, 22

	public static void main(String[] args) {
		new Exercise20();
	}
	
	public Exercise20() {
		int[] list = new int[list1.length + list2.length];
		printList("list1", list1);
		printList("list2", list2);
		merge(list1, list2, list);
		printList("list", list);
	}
	
	public void merge(int[] list1, int[] list2, int[] list) {
		int i = 0;
		int j = 0;
		
		// Complete this part
		
	}
	
	public void printList(String str, int[] list) {
		System.out.print(str + ": ");
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}
}
