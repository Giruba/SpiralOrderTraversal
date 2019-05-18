package Tree;

public class TreeNode {
	private int data;
	private TreeNode leftNode;
	private TreeNode rightNode;
	
	public TreeNode(int data) {
		this.data = data;		
	}
	
	public int GetTreeNodeData() {
		return this.data;
	}
	
	public TreeNode GetTreeNodeLeft() {
		return this.leftNode;
	}
	
	public TreeNode GetTreeNodeRight() {
		return this.rightNode;
	}
	
	public void SetTreeNodeData(int data) {
		this.data = data;
	}
	
	public void SetTreeNodeLeft(TreeNode left) {
		this.leftNode = left;
	}
	
	public void SetTreeNodeRight(TreeNode right) {
		this.rightNode = right;
	}
}
