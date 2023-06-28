package Array;

import java.util.Arrays;

//median of array

/*
 find median of sorted array

Input: N = 5
arr[] = 90 100 78 89 67
Output: 89
Explanation: After sorting the array 
middle element is the median 

Expected Time Complexity: O(n * log(n))
Expected Space Complexity: O(1)
 */

public class MedianOfArray {
   
    public static int findMedian(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        if(n%2==0){
          return ((arr[n/2]+arr[(n-1)/2]));
        }
        return arr[n/2];
    }

    //mai function
    public static void main(String[] args) {
        int [] arr ={90 ,100, 78 ,89 ,67};

        //call the  function
        int ans1= findMedian(arr);
        System.out.println("Median of array is : "+ ans1 );
    }

    
}
