/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Pc
 */
public class main {

    /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
         public static void main(String[] args) {
         DynamicArray array=new DynamicArray(5);
        array.insert(10);
        array.insert(5);
        array.insert(7);
        array.insert(15);
        array.insert(25);
        array.insert(20);
        array.printArray();
        array.removeAt(3);
        array.printArray();
        array.remove(25);
        array.printArray();
       int max= array.max();
       int min= array.min();
        System.out .println(max);
        System.out .println(min);
        array.indexOf(5);

    }

    }
    
}
