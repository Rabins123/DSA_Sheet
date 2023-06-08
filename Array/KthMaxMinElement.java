package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthMaxMinElement {


//--------------------Aproach 1-Using PriorityQueue--------------------------------
//tc-O(n * log(k)
//sc-O(k)

public static int findKthMinimum(int[] arr, int k){

    //creating priorityqueue
    PriorityQueue<Integer> minHeap=new PriorityQueue<>();
    for (int i = 0; i < arr.length; i++) {
        minHeap.offer(arr[i]);

        if (minHeap.size() > k) {
            minHeap.poll();
        }
    }

    return minHeap.peek();


}

public static int findKthMaximum(int[] arr, int k){

    //creating priorityqueue for max heap
    PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
     for (int i = 0; i < arr.length; i++) {
            maxHeap.offer(arr[i]);

            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        return maxHeap.peek();
}

//--------------------Aproach 2-Using Sorting--------------------------------
//tc-nlogn
//sc-1
public static void findkthMaxMinUsingSorting(int nums[], int k){
    int n=nums.length;
    //sort the array
    Arrays.sort(nums);

    //kth max
    System.out.println("kth max elemnt: "+ nums[n-k]);

    //kth min
    System.out.println("kth min elemnt: "+ nums[k-1]);
}

//--------------------Aproach 3-Using --------------------------------
//tc-
//sc-



    //main function
    public static void main(String[] args) {
        int arr[] = {7 ,10, 4 ,3 ,20 ,15};
        int k=3;


      //-----------------------------------------------------------------------------
        System.out.println("___________________________________________________________________");
        System.out.println("Elemnt of array are: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

      //----------------------------------------------------------------------------------------
       System.out.println();
       System.out.println("___________________________________________________________________");
       int kthMax=findKthMaximum(arr,  k);
       System.out.println("Kth max element is : "+kthMax);
       int kthMin=findKthMinimum(arr,  k);
       System.out.println("Kth min element is : "+kthMin);

       //--------------------------------------------------------------------------------------------------
       System.out.println();
       System.out.println("___________________________________________________________________");
       findkthMaxMinUsingSorting(arr, k);

       //--------------------------------------------------------------------------------------------------
       System.out.println();
       System.out.println("___________________________________________________________________");

    }
}
