package Array;

//Median of two sorted Array of different size;

/*
Input: a[] = {-5, 3, 6, 12, 15}, b[] = {-12, -10, -6, -3, 4, 10}
Output: The median is 3.
Explanation: The merged array is: ar3[] = {-12, -10, -6, -5 , -3, 3, 4, 6, 10, 12, 15}.
So the median of the merged array is 3
 */

public class MedianOfTwoSortedArrDiffSize {
  
    //-----------------------------------------------------------------------------------------------
    //tc-
    //sc-1
    
    public static int Median1(int[] arr1, int[] arr2) {
        return 0;
    }

    //main functiuon
    public static void main(String[] args) {
        
        int[] arr1 ={-5, 3, 6, 12, 15};
        int [] arr2={-12, -10, -6, -3, 4, 10};


        //call the function
        int med1= Median1(arr1,arr2);
        System.out.println(med1);
    }

    
}
