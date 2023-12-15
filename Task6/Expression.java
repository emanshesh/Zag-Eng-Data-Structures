/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pc
 */
import java.util.Stack; 
public class Expression { 
 public static boolean isValidExpression(String s) { 
 Stack<Character> stack = new Stack<>(); 
 for (int i = 0; i < s.length(); i++) { 
 char ch = s.charAt(i); 
 if (isRightBracket(ch)) 
 stack.push(ch); 
 if (isLeftBracket(ch)) { 
 if (stack.isEmpty()) 
 return false; 
 char right = stack.pop(); 
 if (!isMatch(right, ch)) 
 return false; 
 } 
 } 
 return stack.isEmpty(); 
 } 
 private static boolean isMatch(char right, char  
left) { 
 return (right == '(' && left == ')') || 
 (right == '{' && left == '}') || 
 (right == '<' && left == '>') || 
 (right == '[' && left == ']'); 
 } 
 private static boolean isLeftBracket(char ch) { 
 return (ch == ')'  ch == '}'  ch == ']' ||  ch == '>'); 
 } 
 public static boolean isRightBracket(char ch) { 
 return (ch == '('  ch == '{'  ch == '[' ||  ch == '<'); 
 } 
}