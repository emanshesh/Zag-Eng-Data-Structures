/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pc
 */
import java.util.HashMap;

public class problem1 {

    public static void countCharacters(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            int count = map.getOrDefault(ch, 0); 
            map.put(ch, count + 1); 
        }

        
        for (Character ch : map.keySet()) {
            System.out.println("Character '" + ch + "': " + map.get(ch) + " occurrences");
        }
    }

    public static void main(String[] args) {
        String s = "Eman Shesh";
        countCharacters(s);
    }
}