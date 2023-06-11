package Matrix;

// search element in row wise column wise sorted matrix
/*
nput: mat[4][4] = { {10, 20, 30, 40},  x = 29
                               {15, 25, 35, 45},
                               {27, 29, 37, 48},
                             {32, 33, 39, 50}}
 
Output: Found at (2, 1)
Explanation: Element at (2,1) is 29
 */

public class searchElementInMatrix1 {

    // ---------------------------Linear Search/Brute force
    // Method--------------------
    // tc-m*n
    // sc-1

    // -------------------------//---approach2- Binary
    // Search/---------------------------
    // tc-O(M + N)
    // sc-1
    // apply binary search in each row
    public static boolean SearchElementUsingBinarySearch(int nums[][], int k){
        if(nums.length==0){
            return false;
        }
        int i=0;
        int j=nums[0].length-1;
        while(i<nums.length && j>=0){
           if(nums[i][j]==k){
            return true;
           }
           else if(nums[i][j]>k){
             j--;
           }
           else{
               i++;
           }
    }

        return false;
        
    }

    // ----------------------------//Approach3-//------------------------------------

    // main function
    public static void main(String[] args) {
        int[][] arr = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        int x = 29;

        // calling the function
        System.out.println("-----------------------------------------------------------");
       boolean ans1=SearchElementUsingBinarySearch(arr, x);
       System.out.println("Element is present in matrix: "+ ans1);

    }

}
