/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Pc
 */
public class problem1 {
public static void main(String[] args) {
        int []arr={1,2,3,4,5,3,2,1,5,3};
        int max = getMax(arr);
        int []freqArray=new int[max+1];
        for (int i=0;i<arr.length;i++)
            freqArray[arr[i]]++;
        for (int i=0;i<freqArray.length;i++)
            if(freqArray[i]!=0)
                System.out.println(freqArray[i]);


    }
    private static int getMax(int []arr){
        int max =arr[0];
        for(int i = 1;i<arr.length;i++)
            if(arr[i]>max)
                max=arr[i];
        return max;
    }
   
    
}
