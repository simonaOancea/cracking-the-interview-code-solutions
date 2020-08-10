package chapter_two.linked_lists;

/**
 * Date 19/06/20.
 * @Author Oancea Simona
 *
 * 2.5 You have two numbers represented by a linked list, where each node contains
 * a single digit. The digits are stored in reverse order, such that the 1's digit is  at
 * the head of the list. Write a function that adds the two numbers and returns the sum
 * of the linked list.
 *
 * Example: Input: (7 -> 1 -> 6) + (5 -> 9 -> 2). That is, 617 + 295.
 *          Output: 2 -> 1 -> 9. That is, 912.
 */
public class LinkedListSumElementsMySolution {
    public static void main(String[] args) {

        headOne = new Node(7);
        headOne.next = new Node(1);
        headOne.next.next = new Node(6);

        headTwo = new Node(5);
        headTwo.next = new Node(9);
        headTwo.next.next = new Node(2);

        System.out.println(sumOfNodes(headOne, headTwo));
    }

    static Node headOne;
    static Node headTwo;

    static class Node {
        int data;
        Node next;

        public Node(int d){
            this.data = d;
            next = null;
        }
    }

    public static int sumOfNodes(Node first, Node second) {
        int firstToNumber;
        int secondToNumber;
        int sum ;

        StringBuilder firstNumber = new StringBuilder();
        StringBuilder secondNumber = new StringBuilder();

        while (first != null) {
            firstNumber.append(first.data);
            first = first.next;
        }

        while (second != null) {
            secondNumber.append(second.data);
            second = second.next;
        }

        firstToNumber = Integer.parseInt(firstNumber.reverse().toString());
        secondToNumber = Integer.parseInt(secondNumber.reverse().toString());
        sum = firstToNumber + secondToNumber;

        return sum;
    }
}
