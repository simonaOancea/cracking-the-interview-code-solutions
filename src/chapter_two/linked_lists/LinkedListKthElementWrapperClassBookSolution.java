package chapter_two.linked_lists;

/**
 * Date 06/06/20.
 *
 *  Implement an algorithm to find the kt to last element of a singly linked list.
 *
 *  Solution #2: recursive approach with wrapper class.
 */
public class LinkedListKthElementWrapperClassBookSolution {

    public static void main(String[] args) {

        LinkedListKthElementWrapperClassBookSolution list = new LinkedListKthElementWrapperClassBookSolution();
        IntWrapper wrapper = new IntWrapper();

        head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(1);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(5);

        Node node = nthToLastR2(head, 4, wrapper);

        System.out.println(node.data);

    }


    static Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static class IntWrapper {
        public int value = 0;
    }

    public static Node nthToLastR2(Node head, int k, IntWrapper i) {
        if (head == null) {
            return null;
        }

        Node node = nthToLastR2(head.next, k, i);
        i.value = i.value + 1;

        if (i.value == k) {
            // We've found the kth element
            return head;
        }

        return node;
    }




}
