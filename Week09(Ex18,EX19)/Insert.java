/* comments */

public class Insert {
	TreeNode tree;
	TestData testData;
	
	public static void main(String[] args) {
		new Insert();
	}
	
	public Insert() {
		testData = new TestData();
		tree = testData.getTree();
		testData.showTree(tree);
		System.out.println();
		tree = insertKey(tree, 68);
		testData.showTree(tree);
		System.out.println();
	}
	
	public TreeNode insertKey(TreeNode tree, int key) {
		System.out.print(key + " >> ");
		testData.showTree(tree);
		System.out.println();
	
		/* complete this part */
	
		return tree;
	}

}
