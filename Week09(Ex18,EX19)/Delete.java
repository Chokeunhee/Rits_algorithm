
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
		tree = deleteKey(tree, 76);
		testData.showTree(tree);
		System.out.println();
	}
	
	public TreeNode deleteKey(TreeNode tree, int key) {
		System.out.print(key + " >> ");
		testData.showTree(tree);
		System.out.println();
		
		if(tree == null) {
			
			/* complete this part */
			
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
