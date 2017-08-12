package Tree;
import java.util.*;

public class LeafNode {
	
	static class Node {
		Node left, right;
		int data;
		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	static void lnode(Node root) {
		if(root == null) return;
		if(root.left == null && root.right == null) {
			System.out.println(root.data);
		}
		lnode(root.left);
		lnode(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		lnode(root);
	}

}
