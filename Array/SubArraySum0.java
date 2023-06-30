package Array;

import java.util.HashMap;
import java.util.HashSet;

//subarray sum 0

/*
 Input:
5
4 2 0 1 6

Output: 
Yes

Explanation: 
0 is one of the element 
in the array so there exist a 
subarray with sum 0.

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).
 */

public class SubArraySum0 {

    // -------------------------------------Using Brute force------------------------------------------------
    // tc-0(n*n)
    // sc -0(1)
    public static boolean findsum1(int arr[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
            }
            if (sum == 0) {
                return true;
            }
        }
        return false;

    }

    // -------------------------------------------UsingHashSET//prefix sum-----------------------------------------------
    // tc-0(n)
    // sc -0(n)

    public static boolean findsum2(int arr[], int n) {
        HashSet<Integer> set = new HashSet<>();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if (sum == 0 || set.contains(0)) {
                return true;
            }
            set.add(sum);
        }
        return false;
    }

    // ---------------------------------------- same but Using Hashmap//prefix sum-------------------------------------
    // tc-0(n)
    // sc -0(n)

    public static boolean findsum3(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (prefixSum == 0 || map.containsKey(prefixSum)) {
                return true;
            }

            map.put(prefixSum, i);
        }

        return false;
    }

    // main function
    public static void main(String[] args) {
        int n = 5;
        int[] arr = { 4, 2, 0, 1, 6 };

        // call the function
        boolean ans1 = findsum1(arr, n);
        System.out.println(ans1);
        System.out.println();

        boolean ans2 = findsum2(arr, n);
        System.out.println(ans2);
        System.out.println();

        boolean ans3 = findsum2(arr, n);
        // System.out.println(ans3);
        System.out.println(ans3 ? "Yes" : "No");
        System.out.println();

    }
}
