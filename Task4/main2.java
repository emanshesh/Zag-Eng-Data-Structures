/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Pc
 */
public class main2 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
            LinkedList list = new LinkedList();
            list.addLast(10);
            list.addLast(20);
            list.addFirst(5);
            list.addLast(30);
            System.out.print("Elements in the LinkedList: ");
            list.printElements();
            list.removeFirst();
            list.removeLast();
            System.out.print("Elements after removing first and last: ");
            list.printElements();
            int index = list.indexOf(20);
            System.out.println("Index of 20: " + index);


            boolean containsValue = list.contains(10);
            System.out.println("Contains 10? " + containsValue);
            int max = list.max();
            int min = list.min();
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);


            int size = list.size();
            System.out.println("Size of the LinkedList: " + size);
        }
    }

