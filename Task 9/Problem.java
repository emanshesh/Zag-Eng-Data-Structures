/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problem;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Problem {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String charachterinput =input.next();
        
       
        int []freq=new int[26];
        for (int i=0;i<charachterinput.length();i++)
            freq[ hash(charachterinput.charAt(i))]++;
        for (int i=0;i<charachterinput.length();i++){
            int index = hash(charachterinput.charAt(i));
             if(freq[index]==1){
                 System.out.println(charachterinput.charAt(i));
                 break;
             }
                 
             }
        
        
            

    }
    public static int hash(int c){
        return c-'a';
    }
}
