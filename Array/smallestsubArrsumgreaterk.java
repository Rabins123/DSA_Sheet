package Array;

//- min subarray with sum greater than k

/*
 Input:
A[] = {1, 4, 45, 6, 0, 19}
x  =  51
Output: 3
Explanation:
Minimum length subarray is 
{4, 45, 6}
 */

public class smallestsubArrsumgreaterk {
   
    //------------------------------------------optimised---------------------------------------
    //tc-
    //sc-
     public static int smallestSubWithSum1(int a[], int n, int x) {
        // Your code goes here 
       int start = 0;
        int end = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        while (end < n) {
            // Expand the window
            sum += a[end];

            // Shrink the window if sum becomes greater than x
            while (sum > x) {
                minLen = Math.min(minLen, end - start + 1);
                sum -= a[start];
                start++;
            }

            end++;
        }

        return minLen;
    }



    //main function
    public static void main(String[] args) {
        int A[] = {1, 4, 45, 6, 0, 19};
         int x  =  51;
         int n=A.length;

         //call the function'
         int ans1=smallestSubWithSum1(A,  n, x);
         System.out.println(ans1);
         System.out.println();
    }
}
