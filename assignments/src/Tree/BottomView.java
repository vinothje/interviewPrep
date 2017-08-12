package Tree;

import java.util.*;

public class BottomView {
	static class Node {
		int data;
		Node left, right;
		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	void traversal(TreeMap tree, Node root, int level) {
		if(root == null) {
			return;
		}
		tree.put(level, root.data);
		traversal(tree, root.left, level-1);
		traversal(tree, root.right, level+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, Integer> tree= new TreeMap<Integer, Integer>();
		BottomView v = new BottomView();
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
//		v.traversal(tree, root, 0);
//		
//		for(Map.Entry<Integer,Integer> k: tree.entrySet()) {
//			System.out.println(k.getValue());
//		}
		TreeMap<Integer, Integer> tree2= new TreeMap<Integer, Integer>();
		Node root2 = new Node(1);
		root2.left = new Node(2);
		root2.left.right = new Node(3);
		root2.left.right.right = new Node(4);
		
		v.traversal(tree2, root2, 0);
		
		for(Map.Entry<Integer,Integer> k: tree2.entrySet()) {
			System.out.println(k.getValue());
		}
	}

}
