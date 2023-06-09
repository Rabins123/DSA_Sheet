//rotate matrix by 90 degree clockwise
/*
 Input:
{ { 1, 2, 3, 4 },
  { 5, 6, 7, 8 },
   { 9, 10, 11, 12 },
   { 13, 14, 15, 16 } };
Output:
13 9 5 1 
14 10 6 2 
15 11 7 3 
16 12 8 4 

 */

package Matrix;



public class rotateMatrixByRightAngle {

    // ------------------------------------//Approach1-Using traspose &&
    // Swapping--//------------------------------
    // Time Complexity – O(n*n)
    // Auxiliary Space – O(1)
    public static void rotate90clockwise(int mat[][]) {

        // transpose of matrix
        for (int i = 0; i < mat.length; i++) {
            for (int j = i + 1; j < mat[0].length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // reverse each row individually
        for (int i = 0; i < mat.length; i++) {
            int j = mat[0].length - 1;
            int k = 0;
            while (k < j) {
                int temp = mat[i][k];
                mat[i][k] = mat[i][j];
                mat[i][j] = temp;
                k++; j--;
            }
        }
    
       // print function
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++)
                System.out.print(mat[i][j] + " ");
                System.out.println();
        }

    }

    // main function
    public static void main(String[] args) {

        int arr[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 },
                        { 13, 14, 15, 16 } };

        // calling the function
        rotate90clockwise(arr);

    }

}
