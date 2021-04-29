package leetcode.dsa;

import leetcode.common.model.Node;

public class TreeSum {
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

		return root;
	}

	public static void main(String[] args) {
		int sum = getSum(buildTree());
		System.out.println("sum: " + sum);
	}

	private static int getSum(Node root) {
		System.out.println("node: " + root);
		if (root == null)
			return 0;

		return root.getData() + getSum(root.getLeft()) + getSum(root.getRight());
	}
}
