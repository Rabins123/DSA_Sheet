package Array;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.Collections;
// import java.util.List;

public class ChocolateDistribution {

    /*
     * gfg se
     * Input:
     * N = 8, M = 5
     * A = {3, 4, 1, 9, 56, 7, 9, 12}
     * Output: 6
     * Explanation: The minimum difference between
     * maximum chocolates and minimum chocolates
     * is 9 - 3 = 6 by choosing following M packets :
     * {3, 4, 9, 7, 9}.
     * 
     * Expected Time Complexity: O(N*Log(N))
     * Expected Auxiliary Space: O(1)
     */

    // -----------------------------------------Using Sortingmethod------------------------------------------
    // tc=nlogn
    // sc=0(1)
    public static long findMinDiff(ArrayList<Integer> a, int n, int m) {
        // your code here

        // sort the array
        Collections.sort(a);
        Long minDiff = Long.MAX_VALUE;
        for (int i = 0; i + m - 1 < n; i++) {
            minDiff = Math.min(minDiff, (a.get(i - 1 + (int) m) - a.get(i)));
        }
        return minDiff;
    }

    // main function
    public static void main(String[] args) {
       
        int n=8;
        int m=5;
        int arr[]={3, 4, 1, 9, 56, 7, 9, 12};
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
       

      //calling function
      long ans1=findMinDiff(list, n, m);
      System.out.println(ans1);

    }
}
