package Tree;
import java.util.*;

/*
  have the delimiter as null when done with all children.
  start with root and add null next to it.
  when polling the queue, 
  if the element is null and 
      if there are elements in queue, then add delimiter to the queue
  else 
      check the left and right and print and add to the queue.
 */

public class LevelOrder {
	
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
		while(!q.isEmpty()) {
			Node n = q.poll();
			if(n == null) {
				System.out.println();
				if(!q.isEmpty()) {
					q.add(null);
				}
			} else {
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
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LevelOrder l1 = new LevelOrder();
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
