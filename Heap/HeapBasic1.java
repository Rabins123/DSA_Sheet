package Heap;

import java.util.PriorityQueue;

//collection framework
public class HeapBasic1 {
    
    public static void main(String[] args) {
        
        //creating priorityQueue
        PriorityQueue <Integer>pq=new PriorityQueue<>();

        // offer() - Inserts elements into the priority queue
        pq.offer(5);
        pq.offer(10);
        pq.offer(2);
        pq.offer(35);

        //printing 
        System.out.println(pq);
    }

}
