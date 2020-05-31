package chapter_two.linked_lists;

import java.util.Hashtable;

/**
 * Date 27/05/20.
 * @Author Cracking the interview code
 *
 * 2.1 Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer was not allowed?
 *
 * Solution: we iterate through the linked list, adding each element to a hash table.
 * When we discover a duplicate element, we remove the element and continue iterating.
 * We can do this all in one pass since we are using a linked list.
 */
public class LinkedList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

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

    public static void deleteDups(Node n) {
        Hashtable table = new Hashtable();
        Node previous = null;

        while (n != null) {

            if(table.containsKey(n.data)) {
                previous.next = n.next;

            } else {
                table.put(n.data, true);
                previous = n;
            }
            n = n.next;
        }
    }

    public void printList(Node node) {
        while (node != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }
    }
}
