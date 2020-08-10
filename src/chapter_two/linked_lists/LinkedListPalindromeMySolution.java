package chapter_two.linked_lists;

import java.util.ArrayList;
import java.util.List;

/**
 * Date 25/06/20.
 * @Author Oancea Simona
 *
 * 2.7 Implement a function to check if a linked list is a palindrome.
 * Input: a -> bc -> d -> dcb -> a -> NULL
 * Output: true
 */
public class LinkedListPalindromeMySolution {

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

    public static boolean isPalindrome(Node n) {
        List<Integer> linkedListNodes = new ArrayList<>();
        boolean isPalindrome = true;

        while (n != null) {
            linkedListNodes.add(n.data);
            n = n.next;
        }

        for (int i = 0; i < linkedListNodes.size(); i ++) {
            if (linkedListNodes.get(i) != linkedListNodes.get(linkedListNodes.size() - i - 1)) {
                isPalindrome = false;
            }
        }

        return isPalindrome;
    }
}
