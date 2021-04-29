package leetcode.common.model;

public class Node {

	public Node() {
		super();
	}

	public Node(int data) {
		super();
		this.data = data;
	}

	public Node(int data, Node left, Node right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}

	int data;
	Node left;
	Node right;

	@Override
	public String toString() {
		return "[ left: " + (left == null ? "null" : left.getData()) + ", data: " + data + ", right: "
				+ (right == null ? "null" : right.getData() + " ]");
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
}
