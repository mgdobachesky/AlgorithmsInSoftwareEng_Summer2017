package binaryTree;

public class IntBST {
	protected IntBSTNode root;
	
	public IntBST() {
		root = null;
	}
	
	protected void visit(IntBSTNode p) {
		System.out.print(p.key + " ");
	}
	
	public void insert(int el) {
		
		IntBSTNode p = root;
		IntBSTNode prev = null;
		
		while(p != null) {
			prev = p;
			if(p.key < el)
				p = p.right;
			else 
				p = p.left;
		}
		
		if (root == null)
			root = new IntBSTNode(el);
		else if(prev.key < el)
			prev.right = new IntBSTNode(el);
		else
			prev.left = new IntBSTNode(el);
	}
	
	public IntBSTNode search(IntBSTNode p, int el) {
		while(p != null)
			if(el == p.key)
				return p;
			else if(el < p.key)
				p = p.left;
			else 
				p = p.right;
		
		return null;
	}
	
	public void breadthFirst() {
		IntBSTNode p = root;
		Queue queue = new Queue();
		
		if(p != null) {
			queue.enqueue(p);
			while(!queue.isEmpty()) {
				p = (IntBSTNode) queue.dequeue();
				visit(p);
				if(p.left != null)
					queue.enqueue(p.left);
				if(p.right != null)
					queue.enqueue(p.right);
			}
		}
	}
	
	protected void inOrder(IntBSTNode p) {
		if(p != null) {
			inOrder(p.left);
			visit(p);
			inOrder(p.right);
		}
	}
	
	public void deleteByMerging(int el) {
		
		IntBSTNode tmp, node, p = root, prev = null;
		
		while(p != null && p.key != el) {
			prev = p;
			if(p.key < el)
				p = p.right;
			else
				p = p.left;
		}
		
		node = p;
		
		if(p != null && p.key == el) {
			if(node.right == null)
				node = node.left;
			
			else if(node.left == null)
				node = node.right;
			else {
				tmp = node.left;
				while(tmp.right != null)
					tmp = tmp.right;
				
				tmp.right = node.right;
				node = node.left;
			}
			if(p == root)
				root = node;
			else if(prev.left == p)
				prev.left = node;
			else
				prev.right = node;
		}
		else if(root != null)
			System.out.println("key " + el + " is not in the tree");
		else 
			System.out.println("the tree is empty");
	}
}
