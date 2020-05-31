package chapter_two.linked_lists;

public class LinkedListKthElement {

    public static void main(String[] args) {
        LinkedListKthElement list = new LinkedListKthElement();

        list.head = new Node(10);
        list.head.next = new Node (9);
        list.head.next.next = new Node(11);
        list.head.next.next.next = new Node(12);
        list.head.next.next.next.next = new Node(6);
        list.head.next.next.next.next.next = new Node(8);

        System.out.println("Linked list before removing duplicates : \n");
        list.printList(head);

        //list.findKthElementToLast(head, 2);
        //System.out.println("");

        //System.out.println("Linked list after removing 2 elements : \n");
        //list.printList(head);

    }

    static Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static int nthToLast(LinkedListKthElement node, int k) {

        if (node == null) {
            return 0;
        }

        int i = nthToLast(node, k) + 1;


        return 0;
    }


    public void printList(Node node) {
        while (node != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }
    }


}
