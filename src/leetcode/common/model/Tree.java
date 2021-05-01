package leetcode.common.model;

import lombok.ToString;

@ToString
public class Tree {
	Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
}
