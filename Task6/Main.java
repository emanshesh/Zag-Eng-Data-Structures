package com.mycompany.task6;
public class Main {
 public static void main(String[] args) {
Stack stack = new Stack();
stack.push(5);
stack.push(4);
stack.push(88);
stack.push(7);
System.out.println( stack.peek());
System.out.println( stack.pop());
System.out.println(stack.pop());
System.out.println( stack.isEmpty());

 Stacklinkedlist stackl = new Stacklinkedlist();
stackl.push(5);
stackl.push(4);
stackl.push(88);
stackl.push(7);
System.out.println( stackl.peek());
System.out.println( stackl.pop());
System.out.println(stackl.pop());
System.out.println( stackl.isEmpty());
stack.reverseString(eman);
 }
public static String reverseString(String s) { 
 Stack<Character> stack = new Stack<>(); 
 String reverse = ""; 
  
 for (int i = 0; i < s.length(); i++) 
 stack.push(s.charAt(i)); 
 while (!stack.isEmpty()) 
 reverse += stack.pop(); 
 return reverse; 
  
}
}