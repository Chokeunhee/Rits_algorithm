/*
 * June 9th 2020
 * Exercise 11 : Printing the node of the tree based on inorder method (left,root,right)
 * By Cho keunhee
 */

public class Exercise11 {
	TestData testData;
	TreeNode tree;
	
	public static void main(String[] args) {
		Exercise11 ex11 = new Exercise11();
		ex11.execution();
	}
	
	public void execution() {
		testData = new TestData();
		tree = testData.getData();
		inorder(tree);
	}
	
	public void inorder(TreeNode tree) {
		if(tree != null) {
			inorder(tree.left);
			visit(tree);
			inorder(tree.right);			
		}	
	}
	
	public void visit(TreeNode tree) {
		System.out.print(" " + tree.data);
	}

}
