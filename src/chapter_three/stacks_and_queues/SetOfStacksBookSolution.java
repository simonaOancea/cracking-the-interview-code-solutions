package chapter_three.stacks_and_queues;


import java.util.ArrayList;
import java.util.Stack;

/**
 * Date 06/07/20.
 * @Author Cracking the code interview
 *
 * 3.3 Imagine a (literal) stack of plates. If the stack gets too high, it might topple.
 * Therefore, in real life, we would likely start a new stack when the previous stack exceeds some
 * threshold. Implement a data structure SetOfStacks that mimics this. SetOfStacks should be composed of
 * several stacks and should create a new stack once the previous one exceeds capacity. SetOfStacks.push()
 * and SetOfStacks.pop() should behave identically to a single stack (that is, pop() should return the same
 * values as it would if there was just a single Stack).
 */
public class SetOfStacksBookSolution {

    public static void main(String[] args) {
        Stack<Integer> firstStack = new Stack<>();
        firstStack.push(1);
        firstStack.push(2);
        firstStack.push(3);
        firstStack.push(4);
        firstStack.push(5);
        firstStack.push(6);
        firstStack.push(7);
        firstStack.push(8);
        firstStack.push(9);
        firstStack.push(10);

        SetOfStacksBookSolution setOfStacks = new SetOfStacksBookSolution();
        setOfStacks.stacks.add(firstStack);

        setOfStacks.push(11);
        setOfStacks.push(12);


        //System.out.println(setOfStacks.popAt(0));
        //System.out.println(setOfStacks.popAt(1));
        System.out.println("Popping last element from last stack: " + setOfStacks.pop());
        System.out.println("Popping last element from stack with index 1: " + setOfStacks.popAt(1));



    }

    public ArrayList<Stack> stacks = new ArrayList<>();

    public void push(int v) {
        Stack last = getLasStack(stacks);
        if (last != null && !isFull(last, 10)) {
            last.push(v);
        } else {
            Stack stack = new Stack();
            stack.push(v);
            stacks.add(stack);
        }
    }

    public int pop() {
        Stack last = getLasStack(stacks);
        int v = (int) last.pop();

        if (last.size() == 0) {
            stacks.remove(stacks.size() - 1);
        }

        return v;
    }

    public int popAt(int index) {
        Stack stack = getStackAtIndex(stacks, index);
        int element = (int) stack.pop();

        if (stack.size() == 0) {
            stacks.remove(index - 1);
        }

        return element;
    }

    public Stack getLasStack(ArrayList<Stack> stacks) {
        int n = stacks.size();
        if (n >= 1) {
            return stacks.get(n-1);
        } else {
            return null;
        }
    }

    public boolean isFull(Stack stack, int capacity) {
        if (stack != null && stack.size() >= capacity) {
            return true;
        }

        return false;
    }

    public Stack getStackAtIndex(ArrayList<Stack> stacks, int index) {
        if (stacks != null && stacks.size() > index) {
            return stacks.get(index);
        }

        return null;
    }




}
