/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pc
 */
public class LinkedList {
 
    private Node head;
    private Node tail;
    private int length;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}
    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public void addLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public int removeFirst() {
        if (head == null) {
            return -1; // or throw an exception
        }
        int value = head.value;
        head = head.next;
        length--;
        if (length == 0) {
            tail = null;
        }
        return value;
    }

    public int removeLast() {
        if (head == null) {
            return -1; // or throw an exception
        }
        int value;
        if (head == tail) {
            value = head.value;
            head = null;
            tail = null;
        } else {
            Node current = head;
            while (current.next != tail) {
                current = current.next;
            }
            value = tail.value;
            tail = current;
            tail.next = null;
        }
        length--;
        return value;
    }

    public int indexOf(int value) {
        int index = 0;
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    public int size() {
        return length;
    }

    public void printElements() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int max() {
        if (head == null) {
            return Integer.MIN_VALUE; // or throw an exception
        }
        int maxVal = head.value;
        Node current = head.next;
        while (current != null) {
            if (current.value > maxVal) {
                maxVal = current.value;
            }
            current = current.next;
        }
        return maxVal;
    }

    public int min() {
        if (head == null) {
            return Integer.MAX_VALUE; // or throw an exception
        }
        int minVal = head.value;
        Node current = head.next;
        while (current != null) {
            if (current.value < minVal) {
                minVal = current.value;
            }
            current = current.next;
        }
        return minVal;
    }
}
    

