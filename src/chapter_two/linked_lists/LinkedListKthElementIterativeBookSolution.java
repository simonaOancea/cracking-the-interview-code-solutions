package chapter_two.linked_lists;

/**
 * Date 06/06/20.
 *
 * Implement an algorithm to find the kt to last element of a singly linked list.
 * A more optimal, but less straightforward, solution is to implement this iteratively.
 * We can use two pointers, p1 and p2. We place them k nodes apart in the linked list by putting
 * p1 at the beggining and moving p2 k nodes into the list. Then, when we move them at the same pace,
 * p2 will hit the end of the linked list after LENGTH - K nodes into the list, or K nodes from the end.
 */

public class LinkedListKthElementIterativeBookSolution {
    public static void main(String[] args) {

        head = new Node(4);
        head.next = new Node(10);
        head.next.next = new Node(15);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(11);
        head.next.next.next.next.next = new Node(13);

        Node node = nThToLast(head, 2);
        System.out.println(node.data);

    }

    public static Node head;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node nThToLast(Node head, int k) {
        if (k == 0) {
            return null;
        }

        Node p1 = head;
        Node p2 = head;

        //Move p2 forward k nodes into the list.
        for (int i = 0; i < k-1; i++) {

            if (p2 == null) {
                return null;
            }

            p2 = p2.next;
        }

        if (p2 == null) {
            return null;
        }

        // Now, move p1 and p2 at the same speed. When p2 hits the end, p1 will be at the right element.
        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1;
    }
}
