/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problem3;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Problem3 {

   public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String charachterinput =input.next();
        
       
        int []freq=new int[26];
        for (int i=0;i<charachterinput.length();i++)
            freq[charachterinput.charAt(i)-'a']++;
        for (int i=0;i<freq.length;i++)
            if(freq[i]!=0)
               for(int j=0;j<freq[i];j++)
                   System.out.print((char)(i+'a'));


    }
        
}
