package Tree;
import Queuee.Queuee;

public class BinarySearchTree {
	private TreeNode root;
	
	public BinarySearchTree(TreeNode treeNode) {
		this.root = treeNode;
	}
	
	public void SetBinarySearchTreeRoot(TreeNode treeNode) {
		this.root = treeNode;
	}
	
	public TreeNode GetBinarySearchTreeRoot() {
		return root;
	}
	
	public TreeNode Insert(TreeNode treeNode, int data) {
		if(treeNode == null) {
			treeNode = new TreeNode(data);
			return treeNode;
		}
		
		if(treeNode.GetTreeNodeData() < data) {
			treeNode.SetTreeNodeRight(Insert(treeNode.GetTreeNodeRight(), data));
		}else {
			treeNode.SetTreeNodeLeft(Insert(treeNode.GetTreeNodeLeft(), data));			
		}		
		
		return treeNode;		
	}
	
	public void PrintInorderTraversal(TreeNode treeNode) {
		if(treeNode == null) {
			return;
		}
		if(treeNode != null) {
			PrintInorderTraversal(treeNode.GetTreeNodeLeft());
			System.out.print(treeNode.GetTreeNodeData()+ " ");
			PrintInorderTraversal(treeNode.GetTreeNodeRight());
		}
	}
	
	public void PrintSpiralTraversal(TreeNode treeNode) {
		if(treeNode == null) {
			System.out.println("Tree is empty!");
		}else {
			Queuee firstQueue = new Queuee();
			Queuee secondQueue = new Queuee();
			firstQueue.Enqueue(treeNode);
			while(firstQueue.GetQueueSize() != 0 ||
					secondQueue.GetQueueSize() != 0) {
				while(firstQueue.GetQueueSize() != 0) {
					TreeNode value = firstQueue.Dequeue();
					if(value != null) {
						System.out.print(value.GetTreeNodeData()+ " ");
						
						if(value.GetTreeNodeLeft() != null) {
							secondQueue.Enqueue(value.GetTreeNodeLeft());
						}
						if(value.GetTreeNodeRight() != null) {
							secondQueue.Enqueue(value.GetTreeNodeRight());
						}
					}
				}
				while(secondQueue.GetQueueSize() != 0) {
					TreeNode value = secondQueue.Dequeue();
					System.out.print(value.GetTreeNodeData()+" ");
					if(value != null) {					
						
						if(value.GetTreeNodeRight() != null) {
							firstQueue.Enqueue(value.GetTreeNodeRight());
						}
						if(value.GetTreeNodeLeft() != null) {
							firstQueue.Enqueue(value.GetTreeNodeLeft());
						}
					}
				}
			}
			
		}
		
	}
}
