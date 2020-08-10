package chapter_two.linked_lists;

import java.util.Stack;

/**
 * Date 26/06/20.
 * @Author Cracking the code interview
 *
 *  2.7 Implement a function to check if a linked list is a palindrome.
 * Input: a -> bc -> d -> dcb -> a -> NULL
 * Output: true
 *
 * #Iterative approach
 */
public class LinkedListPalindromeBookSolution {

    public static void main(String[] args) {

        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(30);
        head.next.next.next.next.next = new Node(20);
        head.next.next.next.next.next.next = new Node(10);

        System.out.println(isPalindrome(head));

    }

    static Node head;

    static class Node {
        int data;
        Node next;

        public Node(int d) {
            this.data = d;
            next = null;
        }
    }

    public static boolean isPalindrome(Node head) {
        Node fast = head;
        Node slow = head;
        Stack<Integer> stack = new Stack<>();

        /* Push elements from first half of linked list onto stack. When fast runner (which is moving
         * at 2x speed) reaches the end of the linked list, then we know we're at the middle. */
        while (fast != null && fast.next != null) {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        /* Has odd number of elements, so skip the middle element. */
        if (fast != null) {
            slow = slow.next;
        }

        while (slow != null) {
            int top = stack.pop().intValue();

            /* If values are different, then it's not a palindrome. */
            if (top != slow.data) {
                return false;
            }

            slow = slow.next;
        }

        return true;
    }
}
