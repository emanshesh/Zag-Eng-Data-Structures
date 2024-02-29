
import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pc
 */


public class problem2 {

    public static char findFirstNonRepeated(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("String cannot be null or empty");
        }
        HashMap<Character, Integer> charCounts = new HashMap<>();
        for (char ch : str.toCharArray()) {
            charCounts.put(ch, charCounts.getOrDefault(ch, 0) + 1);
        }
        for (char ch : str.toCharArray()) {
            if (charCounts.get(ch) == 1) {
                return ch;
            }
        }
        return '\0'; 
    }

    public static void main(String[] args) {
        String s = "Eman shesh";
        char firstNonRepeated = findFirstNonRepeated(s);
        if (firstNonRepeated != '\0') {
            System.out.println("First non-repeated character: " + firstNonRepeated);
        } else {
            System.out.println("No non-repeated characters found");
        }
    }
}
