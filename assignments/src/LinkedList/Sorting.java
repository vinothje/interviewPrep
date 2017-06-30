package LinkedList;

/**
 * Created by vinothjeevanandam on 6/28/17.
 */
public class Sorting {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void doSort(Node node) {
        Node head = node;
        int count = 1;
        while(node != null) {
            count++;
        }
        if(count == 1)
            return;
        int mid = count/2;
        int i=1;
        Node lnode;
        Node lnode_head = node;
        Node prev = null;
        while(i <= mid) {
            lnode = new Node(node.data);
            if(prev == null) {
                prev = lnode;
            } else {
                prev.next = lnode;
            }
            node = node.next;
            i++;
        }

        Node rnode;
        Node rnode_head = node;
        prev = null;
        while(mid <= count) {
            rnode = new Node(node.data);
            if(prev == null) {
                prev = rnode;
            } else {
                prev.next = rnode;
            }
            node = node.next;
            mid++;
        }

        doSort(lnode_head);
        doSort(rnode_head);

        this.merge(node, lnode_head, rnode_head);

    }

    void merge(Node node, Node lnode, Node rnode) {
        int i=0;
        int j=0;
        int k=0;

        while(lnode != null  && rnode != null) {
            if(lnode.data < rnode.data) {
                node.data = lnode.data;
                lnode = lnode.next;
            } else {
                node.data = rnode.data;
                rnode = rnode.next;
            }
            node = node.next;
        }

        while(lnode != null) {
            node.data = lnode.data;
            node = node.next;
            lnode = lnode.next;
        }

        while(rnode != null) {
            node.data = rnode.data;
            node = node.next;
            rnode = rnode.next;
        }
    }

    public static void main(String[] args) {
        Sorting s = new Sorting();
        s.head = new Node(50);
        s.head.next = new Node(10);
        s.head.next.next = new Node(20);
        s.head.next.next.next = new Node(40);
        s.head.next.next.next = new Node(30);
        s.doSort(s.head);
    }
}
