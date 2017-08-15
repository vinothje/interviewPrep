package Tree;
import java.util.*;

/*

 */

public class DictWord2 {
	
	static class Node {
		Node left, right;
		char data;
		Node(char data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	static void dfs(Node root) {
		Stack<Node> st = new Stack<Node>();
		List<Node> visited = new ArrayList<Node>();
		visited.add(root);
		st.push(root);
		while(!st.isEmpty()) {
			if(root.left != null && !visited.contains(root.left))  {
				st.push(root.left);
				visited.add(root.left);
				if(checkWords(st)) {
//					System.out.println("word found:");
				}
			} else if(root.right != null && !visited.contains(root.right))  {
				st.push(root.right);
				visited.add(root.right);
				if(checkWords(st)) {
//					System.out.println("word found:");
				}
			} else {
				st.pop();
			}
			if(!st.isEmpty()) {
				root = st.peek();
			}
		}
		for(Node i:visited) {
			System.out.println(i.data);
		}
	}
	
	static boolean checkWords(Stack<Node> st) {
		String[] list = new String[]{"he", "eh", "hen", "hat", "helo", "at","eva"};
		StringBuilder str = new StringBuilder();
		for(Node n:st) {
			str.append(n.data);
		}
		for(String word:list) {
			if(str.toString().equals(word)) {
				System.out.println("found word:" + word);
			}
		}
		return true;
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
		
		Node root = new Node('h');
		root.left = new Node('a');
		root.right = new Node('e');
		root.left.left = new Node('t');
		root.left.left.left = new Node('e');
		root.right.right = new Node('n');
		
		dfs(root);
	}

}
