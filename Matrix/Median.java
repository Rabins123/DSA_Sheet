package Matrix;

//Given a row wise sorted matrix of size R*C where R and C are always odd, find the median of the matrix.
/*
GFG
 Input:
R = 3, C = 3
M = [[1, 3, 5], 
     [2, 6, 9], 
     [3, 6, 9]]
Output: 5
Explanation: Sorting matrix elements gives 
us {1,2,3,3,5,6,6,9,9}. Hence, 5 is median. 
Expected Time Complexity: O(32 * R * log(C))
Expected Auxiliary Space: O(1)
 */


public class Median {

    //-------------------------------Approach1-------------------------------------------
    //tc-O(32 * R * log(C))
    //sc-O(1)
     public static int findMedian(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

         // Step 1: Find the minimum and maximum values in the matrix
        for (int i = 0; i < rows; i++) {
            minValue = Math.min(minValue, matrix[i][0]);
            maxValue = Math.max(maxValue, matrix[i][cols - 1]);
        }

        // Calculate the required median position
         int  desiredCount= (rows * cols + 1) / 2;

         while (minValue < maxValue) {
            int mid = minValue + (maxValue - minValue) / 2;
            int count = 0;

            for (int i = 0; i < rows; i++) {
                // Step 2: Perform binary search within each row to find the count of elements <= mid
                int low = 0;
                int high = cols - 1;
                int rowCount = 0;

                while (low <= high) {
                    int colMid = low + (high - low) / 2;

                    if (matrix[i][colMid] <= mid) {
                        rowCount = colMid + 1;
                        low = colMid + 1;
                    } else {
                        high = colMid - 1;
                    }
                }

                count += rowCount;
            }

            if (count < desiredCount) {
                minValue = mid + 1;
            } else {
                maxValue = mid;
            }
        }

        // Step 3: The median value is the minimum value after convergence
        return minValue;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            { 1, 3, 5 },
            { 2, 6, 9 },
            { 3, 6, 9 }
        };

        int median = findMedian(matrix);
        System.out.println("The median value is: " + median);

    }
    
}
