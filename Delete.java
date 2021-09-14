/*
 * July 1st 2020
 * Exercise 19 : Deleting a key from the tree and its process
 * By Chokeunhee
 */


public class Delete {
	TreeNode tree;
	TestData testData;

	public static void main(String[] args) {
		new Delete();
	}
	
	public Delete() {
		testData = new TestData();
		tree = testData.getTree();
		testData.showTree(tree);
		System.out.println();
		tree = deleteKey(tree, 32);
		testData.showTree(tree);
		System.out.println();
	}
	
	public TreeNode deleteKey(TreeNode tree, int key) {
		System.out.print(key + " >> ");
		testData.showTree(tree);
		System.out.println();
		
		if(tree == null) {
			/* complete this part */
		}else if (key < tree.getKey()) {
			tree.setLeft(deleteKey(tree.getLeft(), key));
		
		}else if (key > tree.getKey()) {
			tree.setRight(deleteKey(tree.getRight(), key));
		
		}else {
		
			if(tree.getLeft() == null) {
				return tree.getRight();
			}
			
			else if(tree.getRight() == null) {
				return tree.getLeft();
			}
			
			else {
				tree.setKey(minValue(tree.getRight()));
			}
		}
		return tree;
	}
	
	public int minValue(TreeNode tree) {
		int minv = tree.getKey();
		
		while(tree.getLeft() != null) {
			minv = tree.getLeft().getKey();
			tree = tree.getLeft();
		}
		return minv;
	}
}
