package Array;

//

/*
 Input : 
arr[ ] = {2, 1, 5, 6, 3} 
K = 3
Output : 
1
Explanation:
To bring elements 2, 1, 3 together,
swap index 2 with 4 (0-based indexing),
i.e. element arr[2] = 5 with arr[4] = 3
such that final array will be- 
arr[] = {2, 1, 3, 6, 5}

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
 */

public class minmSwapRequire {

    public static int minSwap(int arr[], int n, int k) {
        // Complete the function
    }

    
    // main function
    public static void main(String[] args) {

        // input1
        int arr1[] = { 2, 1, 5, 6, 3 };
        int K1 = 3;
        int n1 = arr1.length;

        // input2
        int arr2[] = { 2, 7, 9, 5, 8, 7, 4 };
        int K2 = 6;
        int n2 = arr2.length;

        // call the function
        int ans1 = minSwap(arr1, n1, K1);
        System.out.println("Minm number of swap required is : " + ans1);

    }
}
