package binaryTree;

public class BinaryTreeTest {

	public static void main(String[] args) {
		
		IntBST myTree = new IntBST();
		
		myTree.insert(13);
		myTree.insert(10);
		myTree.insert(2);
		myTree.insert(12);
		myTree.insert(25);
		myTree.insert(20);
		myTree.insert(31);
		myTree.insert(29);
		
		//System.out.print(myTree.search(myTree.root, 7).key);
		//myTree.breadthFirst();
		//myTree.inOrder(myTree.root);
		
		/*System.out.println("Tree's inOrder before deleting leaf 29.");
		myTree.inOrder(myTree.root);
		myTree.deleteByMerging(29);
		System.out.println("\nTree's inOrder after deleting leaf 29.");
		myTree.inOrder(myTree.root);*/
		
		/*System.out.println("Tree's inOrder before deleting leaf 31.");
		myTree.inOrder(myTree.root);
		myTree.deleteByMerging(31);
		System.out.println("\nTree's inOrder after deleting leaf 31.");
		myTree.inOrder(myTree.root);*/
		
		System.out.println("Tree's inOrder before deleting leaf 13.");
		myTree.inOrder(myTree.root);
		myTree.deleteByMerging(13);
		System.out.println("\nTree's inOrder after deleting leaf 13.");
		myTree.inOrder(myTree.root);
	}

}
