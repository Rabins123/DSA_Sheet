package Matrix;

//Find the kth smallest element in the matrix.--->GFG
/*
 Input:
N = 4
mat[][] =     {{10, 20, 30, 40}
                   {15, 25, 35, 45}
                   {24, 29, 37, 48}
                   {32, 33, 39, 50}}
K = 7
Output: 30
Explanation: 30 is the 7th smallest element.

Expected Time Complexity: O(K*Log(N))
Expected Auxiliary Space: O(N)
 */

public class KthSmallestElementInMatrix {

    //---------------------------approach1-Binary search-------------------
    public static int kthSmallest(int[][]mat,int k){
        //code here.
        int r = mat.length;
        int c = mat[0].length;
        int startval=mat[0][0];
        int endval=mat[r-1][c-1];
        int midval;

        //binary serach betwwn a range
        while(startval<=endval){
            midval= (startval +endval)/2;
            //row wise traversing the matrix
            for()
        }

        return n;
    }




    //main method
    public static void main(String[] args) {
        int arr[][]={{10, 20, 30, 40}
                   {15, 25, 35, 45}
                   {24, 29, 37, 48}
                   {32, 33, 39, 50}};

        int k= 7;

        //calling the function
        System.out.println("--------------------------------------------------------");
         int ans1=kthSmallest(arr, k);
         System.out.println("kth smallest Element is :"+ ans1);
        System.out.println("--------------------------------------------------------");
    }
}
