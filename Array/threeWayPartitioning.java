package Array;

import javax.swing.event.SwingPropertyChangeSupport;

//three way partitioning

/*
 
Input: 
n = 5
A[] = {1, 2, 3, 3, 4}
[a, b] = [1, 2]
Output: 1
Explanation: One possible arrangement is:
{1, 2, 3, 3, 4}. If you return a valid
arrangement, output will be 1.


Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)
 */

public class threeWayPartitioning {

    public static void threeWayPartition1(int array[], int a, int b) {
        // code here
        int start = 0;
        int end = array.length - 1;

        int i = 0;
        while (i <= end) {

            if (array[i] < a) {
                int temp = array[start];
                array[start] = array[i];
                array[i] = temp;
                i++;
                start++;
            } else if (array[i] > b) {
                int temp = array[i];
                array[i] = array[end];
                array[end] = temp;

                end--;
            } else {
                i++;
            }
        }

        // print
        System.out.println("New Array is : ");
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
        }
    }

    // ---------------------------------------//----------------------------------//----------------------------
    // tc-
    // sc-
    public static void threeWayPartition2(int array[], int a, int b) {
        int n = array.length;

        // First pass: Move elements less than a to the beginning
        int start = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] < a) {
                swap(array, i, start);
                start++;
            }
        }

        // Second pass: Move elements greater than b to the end
        int end = n - 1;
        for (int i = n - 1; i >= start; i--) {
            if (array[i] > b) {
                swap(array, i, end);
                end--;
            }
        }

        // print
        System.out.println();
        System.out.println("New Array is : ");
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
        }
    }

    private static void swap(int array[], int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // print
       

    // main function
    public static void main(String[] args) {
        int[] arr1 = { 10, 5, 2, 3, 20, 30, 6, 7 };
        int[] arr2 = { 10, 5, 2, 3, 20, 30, 6, 7,8 };
        int a = 4;
        int b = 8;
        // call the function
        threeWayPartition1(arr1, a, b);
        threeWayPartition2(arr2, a, b);
    }
}
