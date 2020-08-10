package chapter_two.linked_lists;

/**
 * Date 23/06/20.
 * @Author Cracking the interview code
 *
 *
 * 2.6 Given a circular linked list, implement an algorithm which returns the node
 * at the begining of the loop.
 *
 * DEFINITION: Circular linked list: A (corrupt) linked list in which a node's next pointer points
 * to an earlier node, so as to make a loop in the linked list.
 *
 * Example: Input: A -> B -> C -> D -> E -> C [same as C earlier]
 *          Output: C
 */
public class CircularLinkedListBookSolution {

    public static void main(String[] args) {

        head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(4);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(8);
        head.next.next.next.next = head.next;

        Node circularNode = findBeginning(head);

        System.out.println(circularNode.data);

    }

    public static Node head;

    static class Node {
        int data;
        Node next;

        public Node(int d) {
            this.data = d;
            next = null;
        }

    }

    public static Node findBeginning(Node head) {
        Node slow = head;
        Node fast = head;

        /* Find meeting point. This will be LOOP_SIZE - k steps into the linked list. */
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break; //collision point
            }
        }

        /* Error check - no meeting point, and therefore no loop. */
        if (fast == null || fast.next == null) {
            return null;
        }

        /* Move slow to Head. Keep fast at Meeting Point. Each are k steps from the Loop Start. If they move
        at the same pace, they must meet at the Loop Start.
         */

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        /* Both now point to the start of the loop. */
        return fast;
    }
}
