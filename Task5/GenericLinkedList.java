/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pc
 */
    public class GenericLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int length;

    public GenericLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    private static class Node<T> {
        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    public void addFirst(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public void addLast(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public T removeFirst() {
        if (head == null) {
            return null; // or throw an exception
        }
        T value = head.value;
        head = head.next;
        length--;
        if (length == 0) {
            tail = null;
        }
        return value;
    }

    public T removeLast() {
        if (head == null) {
            return null; // or throw an exception
        }
        T value;
        if (head == tail) {
            value = head.value;
            head = null;
            tail = null;
        } else {
            Node<T> current = head;
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

    public int indexOf(T value) {
        int index = 0;
        Node<T> current = head;
        while (current != null) {
            if (current.value.equals(value)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(T value) {
        return indexOf(value) != -1;
    }

    public int size() {
        return length;
    }

    public void printElements() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void reverse() {
        if (head == null || head.next == null) {
            return; // No need to reverse if empty or just one node
        }
        Node<T> prev = null;
        Node<T> current = head;
        Node<T> next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
}