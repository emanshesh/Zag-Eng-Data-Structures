/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pc
 */
public class Stack {
 int[] items; 
 int size = 0; 
 int numberOfItems = 0;
 
 public Stack(int size) { 
 this.size = size; 
 items = new int[size]; 
 } 
 public Stack() { 
 size = 100; 
 items = new int[size]; 
 } 
 public void push(int value) { 
 if (numberOfItems == size) 
 createNewArray(); 
 items[numberOfItems] = value; 
 numberOfItems++; 
 } 
 private void createNewArray() { 
 size *= 2; 
 int[] newArray = new int[size]; 
 for (int i = 0; i < numberOfItems; i++) 
 newArray[i] = items[i]; 
 items = newArray; 
 } 
public boolean isEmpty() { 
 return numberOfItems == 0; 
 } 
 public int peek() { 
 if (isEmpty()) 
 throw new IllegalStateException(); 
 return items[numberOfItems - 1]; 
 } 
 public int pop() { 
 if (isEmpty()) 
 throw new IllegalStateException(); 
 int lastItem = items[numberOfItems - 1]; 
 numberOfItems--; 
 return lastItem;
 }
}
