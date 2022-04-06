/*
 * June 9th 2020
 * Exercise 09 : Printing the node of the tree based on preorder method (root,left,right)
 * By Cho keunhee
 */

public class Exercise9 {
	TestData testData;
	TreeNode tree;
	
	public static void main(String[] args) {
		Exercise9 ex9 = new Exercise9();
		ex9.execution();
	}
	
	public void execution() {
		testData = new TestData();
		tree = testData.getData();
		preorder(tree);
	}
	
	public void preorder(TreeNode tree) {
		if(tree != null) {
			visit(tree);
			preorder(tree.left);
			preorder(tree.right);		
		}	
	}
	
	public void visit(TreeNode tree) {
		System.out.print(" " + tree.data);
	}

}
