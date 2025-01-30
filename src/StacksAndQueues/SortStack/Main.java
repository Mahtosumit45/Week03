package StacksAndQueues.SortStack;

import StacksAndQueues.Stack;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(5);
        s.push(3);
        s.push(1);
        s.push(4);
        s.push(2);
        System.out.println("Unsorted Stack");
        s.print();
        SortStack sortStack = new SortStack();
        sortStack.sort(s);
        System.out.println("Sorted Stack");
        s.print();
    }
}
