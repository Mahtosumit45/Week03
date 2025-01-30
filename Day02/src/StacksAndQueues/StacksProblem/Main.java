package StacksAndQueues.StacksProblem;
import StacksAndQueues.Stack;
public class Main {
    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println( "Dequeued "+queue.dequeue());
        System.out.println("Front element "+queue.peek());
        System.out.println( "Dequeued "+queue.dequeue());

        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println( "Dequeued "+queue.dequeue());
        System.out.println( "Dequeued "+queue.dequeue());
        System.out.println( "Dequeued "+queue.dequeue());

        System.out.println( "Is queue empty? "+queue.isEmpty());
    }
}
