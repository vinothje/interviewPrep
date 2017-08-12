package Tree;
import java.util.*;

public class ZigZag {
	
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
		boolean flag = false;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		q.add(null);
		System.out.println(root.data);
		while(!q.isEmpty()) {
			Node n = q.poll();
			if(n == null) {
				printList(q, flag);
				flag = !flag;
				if(!q.isEmpty()) {
					q.add(null);
				}
			} else {
				if(n.left != null) {
					q.add(n.left);
				}
				if(n.right != null) {
					q.add(n.right);
				}
			}
		}
	}
	
	void printList(Queue<Node> q, boolean flag) {
		StringBuilder str = new StringBuilder();
		for(Node n: q) {
			str.append(n.data);
		}
		if(flag) {
			System.out.println(str);
		} else {
			System.out.println(str.reverse());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZigZag l1 = new ZigZag();
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
