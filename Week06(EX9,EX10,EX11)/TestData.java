
public class TestData {
	TreeNode tree;

	public TestData() {
		tree = new TreeNode("A", null, null);
		tree.left = new TreeNode("B", new TreeNode("D", null, null), null);
		tree.left.right = new TreeNode("E", new TreeNode("H", null, null), new TreeNode("I", null, null));
		tree.right = new TreeNode("C", new TreeNode("F", null, null), new TreeNode("G", null, null));
	}
	
	public TreeNode getData() {
		return tree;
	}
}
