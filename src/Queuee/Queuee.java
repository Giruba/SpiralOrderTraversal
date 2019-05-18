package Queuee;

import Tree.TreeNode;

public class Queuee {
	private LinkedListNode front;
	private LinkedListNode rear;
	private int size;
	
	public Queuee() {}
	
	public void SetQueueFront(LinkedListNode frontNode) {
		front = frontNode;		
	}
	
	public void SetQueueRear(LinkedListNode rearNode) {
		rear = rearNode;
	}
	
	public LinkedListNode GetQueueFront() {
		return front;
	}
	
	public LinkedListNode GetQueueRear() {
		return rear;
	}
	
	public void Enqueue(TreeNode data) {
		size++;
		if(rear == null) {
			rear = front = new LinkedListNode(data);			
		}else {
			rear.SetLinkedListNodeNext(new LinkedListNode(data));
			rear = rear.GetLinkedListNodeNext();			
		}
	}
	
	public TreeNode Dequeue() {
		if(front == null) {
			rear = null;
			System.out.println("Queue is empty!");
			return null;			
		}
		TreeNode value;
		value = front.GetLinkedListNodeData();
		front = front.GetLinkedListNodeNext();
		size--;
		
		return value;
	}
	
	public int GetQueueSize() {
		return size;
	}
	
	public void SetQueueSize(int size) {
		this.size = size;		
	}
}
