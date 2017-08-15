package Tree;
import java.util.*;

/*

 */

public class Diameter {
	
	static class Node {
		Node left, right;
		int data;
		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	static int bfs(Node root, int max) {
		if(root == null) return 0;
		
		int lh = findHeight(root.left);
		int rh = findHeight(root.right);
		System.out.println(lh+":"+rh);
		max = Math.max(max,  lh+rh);
		bfs(root.left, max);
		bfs(root.right, max);
		return max;
	}
	static int findHeight(Node root) {
		if(root == null) return 0;
		return Math.max(findHeight(root.left), findHeight(root.right)) + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Node root = new Node(1);
//		root.left = new Node(2);
//		root.right = new Node(3);
//		root.left.left = new Node(4);
//		root.left.right = new Node(5);
//		root.right.left = new Node(6);
//		root.right.right = new Node(7);
//		
//		System.out.println(bfs(root, Integer.MIN_VALUE));
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.left.left = new Node(6);
		root.left.right.right = new Node(7);
		root.left.left.left.left = new Node(8);
		root.left.right.right.right = new Node(9);
		
		System.out.println(bfs(root, Integer.MIN_VALUE));
	}

}
