package LinkedList;
import java.io.*;

class ReverseLinkedList {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
        Node() {}
    }

    void reverse(Node node) {
        Node head = node;

        node = head;
        Node prev = null;
        Node curr = node;
        while(node != null) {
            node = node.next;
            curr.next = prev;
            prev = curr;
            curr = node;
        }

        this.head = prev;
    }

    public void printList(Node node) {
        while(node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        System.out.println("hello world");
        ReverseLinkedList r = new ReverseLinkedList();
        r.head = new Node(10);
        r.head.next = new Node(20);
        r.head.next.next = new Node(30);
        System.out.print("Input : ");
        r.printList(r.head);
        r.reverse(r.head);
        System.out.println();
        System.out.print("Output : ");
        r.printList(r.head);

        System.out.println("\n");
        ReverseLinkedList r2 = new ReverseLinkedList();
        r2.head = new Node();
        System.out.print("Input : ");
        r2.printList(r2.head);
        r2.reverse(r2.head);
        System.out.println();
        System.out.print("Output : ");
        r2.printList(r2.head);

        System.out.println("\n");
        ReverseLinkedList r3 = new ReverseLinkedList();
        r3.head = new Node(10);
        r3.head.next = new Node(20);
        System.out.print("Input : ");
        r3.printList(r3.head);
        r3.reverse(r3.head);
        System.out.println();
        System.out.print("Output : ");
        r3.printList(r3.head);

    }
}