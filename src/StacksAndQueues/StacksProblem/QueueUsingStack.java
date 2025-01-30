package StacksAndQueues.StacksProblem;
import StacksAndQueues.Stack;
public class QueueUsingStack {
    Stack stack1;
    Stack stack2;
    public QueueUsingStack(){
        stack1 = new Stack();
        stack2 = new Stack();
    }
    public void enqueue(int data){
        stack1.push(data);
    }
    public int dequeue(){
        if(stack2.isEmpty()){
            if(stack1.isEmpty()){
                throw new RuntimeException("Queue is empty");
            }
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }
    public int peek(){
        if(stack2.isEmpty()){
            if(stack1.isEmpty()){
                throw new RuntimeException("Queue is empty");
            }
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }
}
