/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task;

/**
 *
 * @author Pc
 */
import java.util.PriorityQueue;

public class Task {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(5);
        priorityQueue.offer(1);
        priorityQueue.offer(3);
        priorityQueue.offer(2);
        priorityQueue.offer(4);

        while (!priorityQueue.isEmpty()) {
            System.out.print(priorityQueue.poll() + " ");
        }
        System.out.println();
    }
}