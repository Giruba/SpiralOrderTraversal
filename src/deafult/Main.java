import Tree.BinarySearchTree;

public class Main {

	public static void main(String[] args) {
		System.out.println("Spiral Tree Traversal");
		System.out.println("---------------------");
		
		int[] array = InputProcessor.GetArrayFromInput();
		
		BinarySearchTree binarySearchTree = new BinarySearchTree(null);
		for(int index = 0; index < array.length; index++) {			
			binarySearchTree.SetBinarySearchTreeRoot(
					binarySearchTree.Insert(binarySearchTree.GetBinarySearchTreeRoot(), array[index]));
		}
		
		System.out.println("Inorder Traversal--------------");
		binarySearchTree.PrintInorderTraversal(binarySearchTree.GetBinarySearchTreeRoot());
		System.out.println();
		System.out.println("Spiral Order Traversal----------");
		binarySearchTree.PrintSpiralTraversal(binarySearchTree.GetBinarySearchTreeRoot());
		
		System.out.println();
	}
}
