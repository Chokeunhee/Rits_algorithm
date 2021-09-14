/*
 * June 9th 2020
 * Exercise 10 : Printing the node of the tree based on postorder method (left,right,root)
 * By Cho keunhee
 */

public class Exercise10 {
	TestData testData;
	TreeNode tree;
	
	public static void main(String[] args) {
		Exercise10 ex10 = new Exercise10();
		ex10.execution();
	}
	
	public void execution() {
		testData = new TestData();
		tree = testData.getData();
		postorder(tree);
	}
	
	public void postorder(TreeNode tree) {
		if(tree != null) {
			postorder(tree.left);
			postorder(tree.right);
			visit(tree);			
		}	
	}
	
	public void visit(TreeNode tree) {
		System.out.print(" " + tree.data);
	}

}
