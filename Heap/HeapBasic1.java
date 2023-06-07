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
        pq.offer(3);
        

        //printing 
        System.out.println(pq);

         // peek() - Retrieves the head of the priority queue without removing it
         int head = pq.peek();
         System.out.println("Head: " + head);  // Output: Head: 3

         
    }

}
