package chapter_two.linked_lists;


/**
 * Date 31.05.2020
 * @Author Geeks for geeks
 *
 * Implement an algorithm to find the nth node from the end of a linked list.
 *
 * Solution #2: iterative approach
 */

public class LinkedListKthElementIterative {

    public static void main(String[] args) {
        LinkedListKthElementIterative list = new LinkedListKthElementIterative();
        list.push(20);
        list.push(4);
        list.push(15);
        list.push(35);
        list.push(45);
        list.push(60);

        list.printNthFromLast(5);
    }

    /* Linked list node */;
    Node head;

    /* Linked list node */
    class Node {
        int data;
        Node next;

        Node (int d){
            data = d;
            next = null;
        }
    }

    /* Function to get the nth node from the last of a linked list */

    public void printNthFromLast (int n) {
        int len = 0;
        Node temp = head;

        // 1) count the number of nodes in Linked List
        while (temp != null) {
            temp = temp.next;
            len++;
        }

        // check if value of n is not more than length of the linked list
        if (len < n) {
            return;
        }

        temp = head;

        // 2) get the (len-n+1)th node from the beginning
        for (int i = 1; i < len - n + 1; i++) {
            temp = temp.next;

        }

        System.out.println(temp.data);
    }

    /* Inserts a new node at the front of the line */
    public void push(int new_data) {
        /* 1 & 2: Allocate the Node & Put in the data */
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* Move the head to point to new Node */
        head = new_node;
    }


}
