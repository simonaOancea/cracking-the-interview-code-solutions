package chapter_two.linked_lists;

/**
 * Date 31.05.2020
 * @Author Cracking the interview code
 *
 * Implement an algorithm to find the kt to last element of a singly linked list.
 *
 * Solution #1: recursive approach
 */
public class LinkedListKthElementRecursiveBookSolution {

    public static void main(String[] args) {
        LinkedListKthElementRecursiveBookSolution list = new LinkedListKthElementRecursiveBookSolution();

        list.head = new Node(10);
        list.head.next = new Node (9);
        list.head.next.next = new Node(11);
        list.head.next.next.next = new Node(12);
        list.head.next.next.next.next = new Node(6);
        list.head.next.next.next.next.next = new Node(8);

        nthToLast(head, 2);

    }

    static Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static int nthToLast(Node head, int k) {

        if (head == null) {
            return 0;
        }

        int i = nthToLast(head.next, k) + 1;

        if (i == k) {
            System.out.println(head.data);
        }

        return i;
    }


    public static void printList(Node node) {
        while (node != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }
    }


}
