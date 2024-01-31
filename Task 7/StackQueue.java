/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pc
 */
import java.util.Stack;

public class StackQueue {
    Stack<Integer> stack1=new Stack<>();
     Stack<Integer> stack2=new Stack<>();

    public StackQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int item) {
        stack1.push(item);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue item.");
            return -1;
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek item.");
            return -1;
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int size() {
        return stack1.size() + stack2.size();
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue: ");
            for (int i = stack2.size() - 1; i >= 0; i--) {
                System.out.print(stack2.get(i) + " ");
            }
            for (int i = 0; i < stack1.size(); i++) {
                System.out.print(stack1.get(i) + " ");
            }
            System.out.println();
        }
    }
}