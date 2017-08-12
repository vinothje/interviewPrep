package Tree;
import java.util.*;

public class WidthTree {
	
	static class Node {
		Node left, right;
		int data;
		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	void bfs(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		q.add(null);
		System.out.println(root.data);
		int max = Integer.MIN_VALUE;
		int count = 1;
		while(!q.isEmpty()) {
			Node n = q.poll();
			if(n == null) {
				max = Math.max(max,  count);
				count = 0;
				System.out.println();
				if(!q.isEmpty()) {
					q.add(null);
				}
			} else {
				count++;
				if(n.left != null) {
					q.add(n.left);
					System.out.print(n.left.data);
				}
				if(n.right != null) {
					q.add(n.right);
					System.out.print(n.right.data);
				}
			}
		}
		System.out.println("Width:" + max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WidthTree l1 = new WidthTree();
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		l1.bfs(root);
	}

}
