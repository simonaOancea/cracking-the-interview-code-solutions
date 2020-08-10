package chapter_three.stacks_and_queues;

import java.util.Stack;

/**
 * Date 04/07/20.
 * @Author: Cracking the interview code
 *
 * How would you design a stack which, in addition to push and pop, also has a function min which
 * returns the minimum element? Push, pop and min should all operate in O(1) time.
 */
public class StackWithMinBookSolution extends Stack<StackWithMinBookSolution.NodeWithMin> {

    public static void main(String[] args) {
        StackWithMinBookSolution stackWithMin = new StackWithMinBookSolution();

        stackWithMin.push(3);
        stackWithMin.push(1);
        stackWithMin.push(7);
        stackWithMin.push(5);


        System.out.println("The minimum value from stack is: " + stackWithMin.min());
    }

    public void push(int value) {
        int newMin = Math.min(value, min());
        super.push(new NodeWithMin(value, newMin));
    }

    public int min() {
        if (this.isEmpty()) {
            return Integer.MAX_VALUE; // Error value
        } else {
            return peek().min;
        }
    }

    static class NodeWithMin {
        public int value;
        public int min;

        public NodeWithMin(int v, int min) {
            value = v;
            this.min = min;
        }
    }
}
