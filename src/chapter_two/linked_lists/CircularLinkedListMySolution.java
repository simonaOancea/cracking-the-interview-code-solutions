package chapter_two.linked_lists;

import java.util.HashMap;
import java.util.Map;

/**
 * Date 20/06/20.
 * @Author Oancea Simona
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
public class CircularLinkedListMySolution {

    public static void main(String[] args) {
       head = new Node(4);
       head.next = new Node(2);
       head.next.next = new Node(3);
       head.next.next.next = new Node(5);
       head.next.next.next.next = new Node(2);

       System.out.println(retrieveCircularNode(head));

    }

    public static Node head;

    static class Node {
        int data;
        Node next;

        public Node(int d){
            this.data = d;
            next = null;
        }
    }


    public static int retrieveCircularNode(Node n) {
        Map<Integer, Integer> nodesMap = new HashMap<>();
        int duplicateNodeData = 0;
        int counter = 1;

        while (n != null) {
            if (nodesMap.containsKey(n.data)) {
                counter++;
                nodesMap.put(n.data, counter);
            } else {
                nodesMap.put(n.data, 1);

            }
            n = n.next;
        }

        for (Map.Entry<Integer, Integer> nodesMapEntry : nodesMap.entrySet()) {
            if (nodesMapEntry.getValue() > 1) {
                duplicateNodeData = nodesMapEntry.getKey();
            }
        }

        return duplicateNodeData;
    }
}
