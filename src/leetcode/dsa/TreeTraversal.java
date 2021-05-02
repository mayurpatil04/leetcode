package leetcode.dsa;

import java.util.ArrayList;

import leetcode.common.model.Node;

/* tree:
         2
       /   \
      3     4
     / \   / \
    5   6 7   8  */
public class TreeTraversal {
	public static Node buildTree() {
		Node root = new Node(2);

		Node node = new Node(3);
		root.setLeft(node);

		Node left = new Node(5);
		Node right = new Node(6);
		node.setLeft(left);
		node.setRight(right);

		node = new Node(4);
		root.setRight(node);

		left = new Node(7);
		right = new Node(8);
		node.setLeft(left);
		node.setRight(right);

		return root;
	}

	public static void main(String[] args) {
		Node root = buildTree();
		ArrayList<String> results = new ArrayList<String>();
		preOrder(root, results);
		System.out.println("preOrder: " + results);

		results = new ArrayList<String>();
		inOrder(root, results);
		System.out.println("inOrder: " + results);

		results = new ArrayList<String>();
		postOrder(root, results);
		System.out.println("postOrder: " + results);
	}

	private static void preOrder(Node root, ArrayList<String> elements) {
		if (root == null)
			return;

		elements.add("" + root.getData());
		preOrder(root.getLeft(), elements);
		preOrder(root.getRight(), elements);
	}

	private static void inOrder(Node root, ArrayList<String> elements) {
		if (root == null)
			return;

		preOrder(root.getLeft(), elements);
		elements.add("" + root.getData());
		preOrder(root.getRight(), elements);
	}

	private static void postOrder(Node root, ArrayList<String> elements) {
		if (root == null)
			return;

		preOrder(root.getLeft(), elements);
		preOrder(root.getRight(), elements);
		elements.add("" + root.getData());
	}
}
