//Rotate the arry cycally by k
/*
Input: Array[] = {1, 2, 3, 4, 5}, K = 4.
Output: 2 3 4 5 1  
 */

package Array;

public class CycallyRotateByK {

    // ---------------------------------Bruteforce
    // Method--------------------------------------
    // tc-
    // sc-

    public static void rotateByKUsingBruteForce(int[] nums1, int k) {
        int n = nums1.length;
        k = k % n;
        for (int i = 0; i < k; i++) {
            int temp = nums1[n - 1];
            for (int j = n - 1; j > 0; j--) {
                nums1[j] = nums1[j - 1];
            }
            nums1[0] = temp;
        }

        // print the array
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
    }

    // -----reverse method---------//------tc---------//--------sc---------//---------------------//----------------------//
    //   arr={1 ,2 ,3 , 4 ,5 } k=4
    //  reverse first 4-->{5,4,3,2}
    //  reversing last remaining--> {1}
    //  arr={1,5,4,3,2}-->reverse-->{2,3,4,5,1}

    public static void rotatebyKUsingReverse(int[] nums2, int k) {
        int n = nums2.length;
        k = k % n;
    
        reverse(nums2, 0, n - 1);
        reverse(nums2, 0, k - 1);
        reverse(nums2, k, n - 1);

        //print the array
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }

    }
    
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // main method
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int K = 4;

        System.out.println("-------------------------------Original Array-----------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("----------------------------Bruteforce Method-------------------------");
        rotateByKUsingBruteForce(arr, K);

        System.out.println();
        System.out.println("----------------------------Reverse Method-------------------------");
        rotatebyKUsingReverse(arr,K);
    }
}
