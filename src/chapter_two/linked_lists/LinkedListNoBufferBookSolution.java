package chapter_two.linked_lists;

/**
 * Date 27/05/20.
 * @Author Cracking the interview code
 *
 * 2.1 Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer was not allowed?
 *
 * Solution: If we don't have a buffer, we can iterate with two pointers: current which iterates
 * through the linked list, and runner which checks all subsequent nodes for duplicates.
 */

public class LinkedListNoBufferBookSolution {

    public static void main(String[] args) {
        LinkedListNoBufferBookSolution list = new LinkedListNoBufferBookSolution();

        list.head = new Node(10);
        list.head.next = new Node(12);
        list.head.next.next = new Node(11);
        list.head.next.next.next = new Node(11);
        list.head.next.next.next.next = new Node(12);
        list.head.next.next.next.next.next = new Node(11);
        list.head.next.next.next.next.next.next = new Node(10);

        System.out.println("Linked list before removing duplicates : \n");
        list.printList(head);

        list.deleteDups(list.head);
        System.out.println("");
        System.out.println("Linked list after removing duplicates : \n");
        list.printList(head);

    }

    static Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }


    public static void deleteDups(Node head) {
        if (head == null) {
            return;
        }

        Node current = head;

        while (current != null) {
            /*Remove all future nodes that have the same value */
            Node runner = current;

            while (runner.next != null) {

                if(runner.next.data == current.data) {
                    runner.next = runner.next.next;

                } else {
                    runner = runner.next;
                }
            }

            current = current.next;
        }

    }


    public static void printList(Node node) {
        while (node != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }
    }
}



