/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hotpotatogame;

/**
 *
 * @author Pc
 */
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class HotPotatoGame {
    public static String hotPotato(String[] children, int tosses) {
        Queue<String> queue = new LinkedList<>();

       
        queue.addAll(Arrays.asList(children));

        while (queue.size() > 1) {
            
            for (int i = 0; i < tosses - 1; i++) {
                
                String child = queue.poll();
                queue.add(child);
            }

           
            queue.poll();
        }

        
        return queue.poll();
    }

    public static void main(String[] args) {
        String[] children = {"reda", "zeid", "abdo", "tahoon"};
        int tosses = 1;
        String winner = hotPotato(children, tosses);
        System.out.println("The winner is: " + winner);

        String[] children2 = {"Alice", "Bob", "Cathy", "Dave", "Eva"};
        int tosses2 = 3;
        String winner2 = hotPotato(children2, tosses2);
        System.out.println("The winner is: " + winner2);

        String[] children3 = {"A", "B", "C", "D"};
        int tosses3 = 3;
        String winner3 = hotPotato(children3, tosses3);
        System.out.println("The winner is: " + winner3);
    }
}
