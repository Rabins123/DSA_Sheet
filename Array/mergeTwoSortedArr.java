package Array;
//merge two sorted array -no extra space

import java.util.Arrays;

/*
 Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8} 
Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}

Input: arr1[] = { 5, 8, 9}, arr2[] = {4, 7, 8} 
Output: arr3[] = {4, 5, 7, 8, 8, 9} 
 */

public class mergeTwoSortedArr {

    // ---------------------------------------------------------------------------------------------
    // tc-o(m+n)
    // sc-0(m+n)
    public static void merge(int nums1[], int nums2[]) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] temp = new int[nums1.length + nums2.length];
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                temp[k++] = nums1[i++];
            } else {
                temp[k++] = nums2[j++];
            }
        }

        // Elements left in the first array
        while (i < nums1.length) {
            temp[k++] = nums1[i++];
        }

        // Elements left in the second array
        while (j < nums2.length) {
            temp[k++] = nums2[j++];
        }

        // Printing the merged array
        for (int a = 0; a < nums1.length + nums2.length; a++) {
            System.out.print(temp[a] + " ");
        }
    }

    // -----------------------------//add elemnt in new array then sort the
    // array//-----------------------------------
    // tc-o(m+n)log(m+n)
    // sc-0(m+n)
    public static void merge2(int nums3[], int nums4[]) {
         int i2 = 0;
        int j2 = 0;
        int k2 = 0;
        int[] temp2 = new int[nums3.length + nums4.length];

        for( i2=0;i2<nums3.length;i2++){
             temp2[k2++]=nums3[i2];
        }
        for( j2=0;j2<nums4.length;j2++){
             temp2[k2++]=nums4[j2];
        }

        //sort the array
       Arrays.sort(temp2);

        //print the array
        System.out.println("Using sorting : ");
          for (int b = 0; b < temp2.length; b++) {
            System.out.print(temp2[b] + " ");
        }
    }

    // Main function
    public static void main(String[] args) {
        int arr1[] = { 1, 3, 4, 5 };
        int arr2[] = { 2, 4, 6, 8 };

        // Call the merge function
        merge(arr1, arr2);
        // -----------------------------------------------------------------------------------------------
        System.out.println();
        int arr3[] = { 5, 8, 9 };
        int arr4[] = { 4, 7, 8 };
        // Call the merge function
        merge2(arr3, arr4);

    }
}
