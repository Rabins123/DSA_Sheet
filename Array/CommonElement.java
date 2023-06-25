package Array;

import java.util.ArrayList;

// find common element from three sorted arrray
/*
 Input:
n1 = 6; A = {1, 5, 10, 20, 40, 80}
n2 = 5; B = {6, 7, 20, 80, 100}
n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20 80
Explanation: 20 and 80 are the only
common elements in A, B and C.

Expected Time Complexity: O(n1 + n2 + n3)
Expected Auxiliary Space: O(n1 + n2 + n3)
 */

public class CommonElement {

    public static ArrayList<Integer> commonElement(int[] A, int[] B, int[] C, int n1, int n2, int n3) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2 && k < n3) {
            if (A[i] < B[j]) {
                i++;
            } else if (A[i] < B[j]) {
                j++;
            } else {
                k++;
            }
        }
        return null;

    }

    // main function
    public static void main(String[] args) {
        int[] A = { 1, 5, 10, 20, 40, 80 };
        int[] B = { 6, 7, 20, 80, 100 };
        int[] C = { 3, 4, 15, 20, 30, 70, 80, 120 };
        int n1=A.length;
        int n2=B.length;
        int n3=C.length;

    //call the function
    ArrayList<Integer> ans1=commonElement(A, B, C,n1, n2,  n3) ;
    System.out.println(ans1);

    }
}
