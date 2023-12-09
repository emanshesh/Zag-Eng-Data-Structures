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
        GenericLinkedList<Integer> list = new GenericLinkedList<>();
        
        list.addLast(5);
        list.addLast(10);
        list.addLast(15);
        list.addLast(20);

        list.printElements();

        list.reverse();

        
        list.printElements();
    }
}