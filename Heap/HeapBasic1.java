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


        // poll() - Retrieves and removes the head of the priority queue
        int removedElement = pq.poll();
        System.out.println("Removed Element: " + removedElement);  // Output: Removed Element: 3

        // size() - Returns the number of elements in the priority queue
        int size = pq.size();
        System.out.println("Size: " + size);  // Output: Size: 2

        // isEmpty() - Checks whether the priority queue is empty
        boolean empty = pq.isEmpty();
        System.out.println("Is Empty: " + empty);  // Output: Is Empty: false

         // Printing the elements in the priority queue
         System.out.println("Priority Queue: " + pq);  // Output: Priority Queue: [5, 10]
    }

}
