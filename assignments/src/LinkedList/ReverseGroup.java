package LinkedList;

/*
 Given a linked list l, reverse its nodes k at a time and return the modified list. k is a positive integer that is less than or equal to the length of l. If the number of nodes in the linked list is not a multiple of k, then the nodes that are left out at the end should remain as-is.

You may not alter the values in the nodes - only the nodes themselves can be changed.

Example

For l = [1, 2, 3, 4, 5] and k = 2, the output should be
reverseNodesInKGroups(l, k) = [2, 1, 4, 3, 5];
For l = [1, 2, 3, 4, 5] and k = 1, the output should be
reverseNodesInKGroups(l, k) = [1, 2, 3, 4, 5];
For l = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11] and k = 3, the output should be
reverseNodesInKGroups(l, k) = [3, 2, 1, 6, 5, 4, 9, 8, 7, 10, 11].
 */

public class ReverseGroup {
	static class Node<Integer> {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	
	static Node reverse(Node root, int part, int segment) {
		Node prev = null;
		Node curr = root;
		int count = 1;
		Node head = null;
		Node p1 = null;
		Node p2 = root;
		int cnt_seg = 1;
		if(segment == 0 || part == 1) {
			return root;
		}
		while(root != null && cnt_seg <= segment) {
			count = count%part;

			while (count <= part && root != null) {
				root = root.next;
				curr.next = prev;
				prev = curr;
				curr = root;
				count++;
			}
			if(p1 != null) {
				p1.next = prev;
			}
			p2.next = curr;
			if (head == null) {
				head = prev;
			}
			p1 = p2;
			p2 = curr;
			cnt_seg++;
		}
		return head;
	}
	
	static void printNode(Node node) {
		while(node !=null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
	
	static int nodeSize(Node node) {
		int count=0;
		while(node != null) {
			count++;
			node = node.next;
		}
		return count;
	}
	
	static Node reverseNodesInKGroups(Node root, int k) {
		int length = nodeSize(root);
		return reverse(root, k, length/k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.next = new Node(2);
		root.next.next = new Node(3);
		root.next.next.next = new Node(4);
		root.next.next.next.next = new Node(5);
		root.next.next.next.next.next = new Node(6);
		root.next.next.next.next.next.next = new Node(7);
		root.next.next.next.next.next.next.next = new Node(8);
		root.next.next.next.next.next.next.next.next = new Node(9);
		root.next.next.next.next.next.next.next.next.next = new Node(10);
		root.next.next.next.next.next.next.next.next.next.next = new Node(11);
		root.next.next.next.next.next.next.next.next.next.next.next = new Node(12);

		printNode(reverseNodesInKGroups(root, 3));
	}

}
