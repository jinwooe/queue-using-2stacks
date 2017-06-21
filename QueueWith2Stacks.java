package io.jade.book1;

import java.util.Stack;

public class QueueWith2Stacks {

    private Stack<Object> stack1 = new Stack();
    private Stack<Object> stack2 = new Stack();

    public void enqueue(Integer i) {
        stack1.push(i);
    }

    public Object dequeue() {
        if(stack2.size() > 0) {
            return stack2.pop();
        }

        if(stack1.size() > 0) {
            while(!stack1.empty()) {
                stack2.push(stack1.pop());
            }

            return stack2.pop();
        }

        return null;
    }
}
