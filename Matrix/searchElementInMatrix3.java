package Matrix;

//fully sorted matrix
/*
 Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
  Output: true
  tc-O(log(m * n))
 */

 /*
  Note
  Use binary search.
  n * m matrix convert to an array => matrix[x][y] => a[x * m + y]
  an array convert to n * m matrix => a[x] =>matrix[x / m][x % m];
  */

public class searchElementInMatrix3 {
   
    //-----------------------------Approach1---------------------------------------
    //optimised
    //tc-O(log(m * n))
    //sc-0(1)
    public static boolean searchMatrix(int[][] matrix, int target) {
         int n = matrix.length;
        int m = matrix[0].length;
        int l = 0, r = m * n - 1;
        while (l != r){
            int mid = (l + r - 1) >> 1;
            if (matrix[mid / m][mid % m] < target)
                l = mid + 1;
            else 
                r = mid;
        }
        return matrix[r / m][r % m] == target;
        
    }


    //main function
    public static void main(String[] args) {
        int arr[][]={{1,3,5,7},
                     {10,11,16,20},
                      {23,30,34,60}};

        int target = 50;
        
        //caling function
        boolean isElementPresent=searchMatrix(arr, target);
        System.out.println("Is element present in Matrix : "+isElementPresent);
    }
}
