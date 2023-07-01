package Array;

/*
 Input: N = 5, arr[] = {2, 4, 1, 3, 5}
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 
has three inversions (2, 1), (4, 1), (4, 3).

Expected Time Complexity: O(NLogN).
Expected Auxiliary Space: O(N).
 */


public class inversionCount {
  
   public static int getInversionCount(int[] arr) {
        int inversionCount = 0;
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    inversionCount++;
                }
            }
        }
        
        return inversionCount;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};

        int inversionCount = getInversionCount(arr);

        System.out.println("Inversion Count: " + inversionCount);
    }
}
