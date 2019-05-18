package Queuee;

import Tree.TreeNode;

public class LinkedListNode {
	private TreeNode data;
	private LinkedListNode nextNode;
	
	public LinkedListNode(TreeNode data) {
		this.data = data;
	}
	
	public void SetLinkedListNodeData(TreeNode data) {
		this.data = data;
	}
	
	public void SetLinkedListNodeNext(LinkedListNode nextNode) {
		this.nextNode = nextNode;
	}
	
	public TreeNode GetLinkedListNodeData() {
		return data;
	}
	
	public LinkedListNode GetLinkedListNodeNext() {
		return nextNode;
	}
}
