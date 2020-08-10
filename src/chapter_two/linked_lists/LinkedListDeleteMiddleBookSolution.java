package chapter_two.linked_lists;

/**
 * Date 12/06/20.
 * @Author Cracking the interview code
 *
 * Implement an algorithm to delete a node in the middle of a singly linked list,
 * given only access to that node.
 *
 * Ex: Input: the node c from the linked list a->b->c->d->e.
 * Result: nothing is returned, but the new linked list looks like a->b->d->e.
 *
 * In this problem, you are not given access to the head of the linked list.
 * You only have access to that node. The solution is simply to copy the data from the next node
 * over to the current node, and then to delete the next node.
 *
 */
public class LinkedListDeleteMiddleBookSolution {

    public static void main(String[] args){

        head = new Node(10);
        head.next = new Node(14);
        head.next.next = new Node(9);
        head.next.next.next = new Node(12);
        head.next.next.next.next = new Node(7);

        System.out.println(deleteNode(head.next.next));
    }

    public static Node head;

    public static class Node {
        int data;
        Node next;

        public Node(int d){
            data = d;
            next = null;
        }
    }

    public static boolean deleteNode(Node n){

        if (n == null || n.next == null) {
            return false; //Failure
        }

        Node next = n.next;
        n.data = next.data; //copying the node
        n.next = n.next.next; //deleting the node

        return true;
    }
}
