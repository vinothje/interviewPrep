package LinkedList;

import java.util.Stack;

/**
 * Created by vinothjeevanandam on 6/28/17.
 */
public class CheckPalindrome {
    static Node head;

    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
        Node() {}
    }

    void check(Node head) {
        Node node = head;

        Stack<Character> st = new Stack<Character>();
        Node runner = node;
        st.push(node.data);
        while(runner.next != null && runner.next.next != null) {
            node = node.next;
            runner = runner.next.next;
            st.push(node.data);
        }

        if(runner.next != null) {
            node = node.next;
        }

        while(node != null) {
            Character ch = st.pop();
            if(ch != node.data) {
                System.out.println("Not Palindrome");
                return;
            }
            node = node.next;
        }
        System.out.println("Palindrome");
    }

    void printList(Node head) {
        Node node = head;

        while(node != null) {
            System.out.print(node.data);
            node = node.next;
        }
        System.out.print(" : ");
    }
    public static void main(String[] args) {
        CheckPalindrome c1 = new CheckPalindrome();
        c1.head = new Node('m');
        c1.head.next = new Node('a');
        c1.head.next.next = new Node('b');
        c1.head.next.next.next = new Node('b');
        c1.head.next.next.next.next = new Node('a');
        c1.head.next.next.next.next.next = new Node('m');
        c1.printList(c1.head);
        c1.check(c1.head);

        CheckPalindrome c2 = new CheckPalindrome();
        c2.head = new Node('m');
        c2.head.next = new Node('a');
        c2.head.next.next = new Node('d');
        c2.head.next.next.next = new Node('a');
        c2.head.next.next.next.next = new Node('m');
        c1.printList(c1.head);
        c2.check(c2.head);

        CheckPalindrome c3 = new CheckPalindrome();
        c3.head = new Node('m');
        c3.head.next = new Node('a');
        c3.head.next.next = new Node('d');
        c3.head.next.next.next = new Node('a');
        c3.head.next.next.next.next = new Node('g');
        c1.printList(c1.head);
        c3.check(c3.head);

        CheckPalindrome c4 = new CheckPalindrome();
        c4.head = new Node('m');
        c1.printList(c1.head);
        c4.check(c4.head);

        CheckPalindrome c5 = new CheckPalindrome();
        c5.head = new Node();
        c1.printList(c1.head);
        c5.check(c5.head);
    }
}
