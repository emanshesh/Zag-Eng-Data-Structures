
public class Stacklinkedlist {
 
 private class Node { 
 int value; 
 Node button; 
 public Node(int value) { 
 this.value = value; 
 } 
 } 
 Node top; 
 private boolean isEmpty() { 
 return top == null; 
 } 
 public void push(int value) { 
 Node node = new Node(value); 
 node.button = top; 
 top = node; 
 }
public int peek() { 
 if (isEmpty()) 
 throw new IllegalStateException(); 
 return top.value; 
 } 
 public int pop() { 
 if (isEmpty()) 
 throw new IllegalStateException(); 
 int value = top.value; 
 top = top.button; 
 return value; 
 }
}
