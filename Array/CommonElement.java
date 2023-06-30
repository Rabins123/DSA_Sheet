package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


    //-------------------------------------------------Using Brute force---------------------------------------------
    //tc-0(n1*n2*n3)
    //sc-0(1)
   public static List<Integer> findCommonElements1(int[] A, int[] B, int[] C) {
        List<Integer> commonElements = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                for (int k = 0; k < C.length; k++) {
                    if (A[i] == B[j] && B[j] == C[k]) {
                        commonElements.add(A[i]);
                        break;
                    }
                }
            }
        }

        return commonElements;
    }


    //-------------------------------------------------------------------------------------------------------------
    //tc-O(n1 + n2 + n3)
    //sc-0(1)
        public static List<Integer> findCommonElements2(int[] A, int[] B, int[] C) {
        List<Integer> commonElements = new ArrayList<>();
        int i = 0, j = 0, k = 0;

        while (i < A.length && j < B.length && k < C.length) {
            if (A[i] == B[j] && B[j] == C[k]) {
                commonElements.add(A[i]);
                i++;
                j++;
                k++;
            } else if (A[i] < B[j]) {
                i++;
            } else if (B[j] < C[k]) {
                j++;
            } else {
                k++;
            }
        }

        return commonElements;
    }


      public static List<Integer> findCommonElements3(int[] A, int[] B, int[] C) {
        List<Integer> commonElements = new ArrayList<>();
        Map<Integer, Integer> frequencyMapA = new HashMap<>();
        Map<Integer, Integer> frequencyMapB = new HashMap<>();
        Map<Integer, Integer> frequencyMapC = new HashMap<>();

        // Count the frequencies of elements in each array
        for (int num : A) {
            frequencyMapA.put(num, frequencyMapA.getOrDefault(num, 0) + 1);
        }
        for (int num : B) {
            frequencyMapB.put(num, frequencyMapB.getOrDefault(num, 0) + 1);
        }
        for (int num : C) {
            frequencyMapC.put(num, frequencyMapC.getOrDefault(num, 0) + 1);
        }

        // Iterate through the arrays and find common elements
        for (int num : A) {
            if (frequencyMapA.get(num) > 0 && frequencyMapB.getOrDefault(num, 0) > 0 && frequencyMapC.getOrDefault(num, 0) > 0) {
                commonElements.add(num);
                frequencyMapA.put(num, frequencyMapA.get(num) - 1);
                frequencyMapB.put(num, frequencyMapB.get(num) - 1);
                frequencyMapC.put(num, frequencyMapC.get(num) - 1);
            }
        }

        return commonElements;
    }

    public static void main(String[] args) {
        int[] A = {1, 5, 10, 20, 40, 80};
        int[] B = {6, 7, 20, 80, 100};
        int[] C = {3, 4, 15, 20, 30, 70, 80, 120};

        List<Integer> result1 = findCommonElements1(A, B, C);
        System.out.println("Common Elements: " + result1);
        System.out.println();

        List<Integer> result2 = findCommonElements2(A, B, C);
        System.out.println("Common Elements: " + result2);
    }
}
