package assign9;

public class BST {

	private static class Node {
		private Node left;
		private int data;
		private Node right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	private Node root;

	public void insert(int data) {
		Node newNode = new Node(data);
		if (root == null)
			root = newNode;
		else {
			insert(root, newNode);
		}

	}

	private void insert(Node root, Node newNode) {
		if (newNode.data < root.data) {

			if (root.left == null) {
				root.left = newNode;
			} else
				insert(root.left, newNode);

		} else {
			if (root.right == null) {
				root.right = newNode;
			} else
				insert(root.right, newNode);

		}
	}

	public void display() {
		
		preorder(root);
		System.out.println();
	}

	private void preorder(Node root) {
		if (root != null) {
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
		else
			return;
	}
	private void postorder(Node root) {
		if (root != null) {
			
			preorder(root.left);
			preorder(root.right);
			System.out.print(root.data+" ");
		}
		else
			return;
	}
	private void inorder(Node root) {
		if (root != null) {
			
			preorder(root.left);
			System.out.print(root.data+" ");
			preorder(root.right);
		}
		else
			return;
	}
	
	
	
	

}
