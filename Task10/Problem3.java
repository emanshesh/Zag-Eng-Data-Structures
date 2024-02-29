/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pc
 */

import java.util.HashMap;

public class Problem3 {

  public static int findMostFrequent(int[] nums) {
    HashMap<Integer, Integer> counts = new HashMap<>();
    for (int num : nums) {
      counts.put(num, counts.getOrDefault(num, 0) + 1);
    }
    int maxCount = 0;
    int mostFrequent = -1;
    for (int num : counts.keySet()) {
      int count = counts.get(num);
      if (count > maxCount) {
        maxCount = count;
        mostFrequent = num;
      }
    }
    return mostFrequent;
  }
  public static void main(String[] args) {
    int[] nums = {1, 2, 2, 3, 3, 3, 4};
    int mostFrequent = findMostFrequent(nums);
    System.out.println(mostFrequent); 
  }
}