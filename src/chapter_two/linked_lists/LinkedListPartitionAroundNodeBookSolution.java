package chapter_two.linked_lists;

/**
 * Date 14/06/20.
 * @Author Cracking the code interview
 *
 * Write code to partition a linked list around a value x, such that all nodes less than x come before
 * all nodes greater than or equal to x.
 *
 * Solution: If this were an array, we would need to be careful about how we shifted elements. Array shifts are very expensive.
 *
 * However, in a linked list, the situation is much easier. Rather than shifting and swapping elements, we can actually
 * create two different linked lists: one for the elements less than x, and one for the elements greater than or equal to x.
 * We iterate through the linked list, inserting elements into out before list or our after list.
 * Once we reach the end of the linked list and have completed the splitting, we merge the two lists.
 *
 */
public class LinkedListPartitionAroundNodeBookSolution {

    public static void main(String[] args){

        head = new Node(7);
        head.next = new Node(9);
        head.next.next = new Node(6);
        head.next.next.next = new Node(8);
        head.next.next.next.next = new Node(10);
        head.next.next.next.next.next = new Node(3);
        head.next.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next.next = new Node(16);
        head.next.next.next.next.next.next.next.next = new Node(20);

        partition(head, 8);

        printList(head);


    }

    static Node head;

    static class Node {
        int data;
        Node next;

        public Node(int d){
            this.data = d;
            next = null;
        }
    }

    public static Node partition(Node node, int x) {

        Node beforeStart = null;
        Node beforeEnd = null;
        Node afterStart = null;
        Node afterEnd = null;

        /* Partition list */
        while (node != null) {
            Node next = node.next;
            node.next = null;

            if (node.data < x) {
                /* Insert node into end of before list */
                if (beforeStart == null) {
                    beforeStart = node;
                    beforeEnd = beforeStart;
                } else {
                    beforeEnd.next = node;
                    beforeEnd = node;
                }
            } else {
                /* Insert node into end of after list */
                if (afterStart == null) {
                    afterStart = node;
                    afterEnd = afterStart;
                } else {
                    afterEnd.next = node;
                    afterEnd = node;
                }
            }

            node = next;
        }

        if (beforeStart == null) {
            return afterStart;
        }

        /* Merge before list and after list */
        beforeEnd.next = afterStart;

        return beforeStart;
    }


    public static void printList(Node node) {
        while (node != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }
    }



}
