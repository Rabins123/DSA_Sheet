package Array;

//kadanes algoritm
//Function to find the sum of contiguous subarray with maximum sum.
/*
 N = 5
Arr[] = {1,2,3,-2,5}
Output:
9

N = 4
Arr[] = {-1,-2,-3,-4}
Output:
-1
 */
public class KadanesAlgo1 {

    // ------------------------------------------------------------Kadane's
    // Algorithm--------------------------------------------//
    // tc-0(n)
    // sc-0(1)

    public static long maxSubarraySum(int arr[]) {

        // Your code here
        long currsum = arr[0]; // max sum till index i(including)
        long sumsofor = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currsum = Math.max(arr[i], currsum + arr[i]);
            sumsofor = Math.max(sumsofor, currsum);
        }

        return sumsofor;
    }

    // main function
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, -2, 5 };
        int arr2[] = { -1, -2, -3, -4 };

        // call the function
        long ans1 = maxSubarraySum(arr1);
        System.out.println("maxsum subarray is : " + ans1);
        long ans2 = maxSubarraySum(arr2);
        System.out.println("maxsum subarray is : " + ans2);
    }
}
