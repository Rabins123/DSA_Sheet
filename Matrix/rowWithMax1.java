//row with max1
/*
 Input: 
N = 4 , M = 4
Arr[][] = {{0, 1, 1, 1},
           {0, 0, 1, 1},
           {1, 1, 1, 1},
           {0, 0, 0, 0}}
Output: 2
Explanation: Row 2 contains 4 1's (0-based
indexing).

Expected Time Complexity: O(N+M)
Expected Auxiliary Space: O(1)
 */


package Matrix;

public class rowWithMax1 {
    
    //--------------------------Approach1-Using for loop-----------------------------------------------------
    //tc-->0(m*n)
    //sc-->0(1)
    public static int rowWithMaxTime1(int[][] nums){
        int max=0;
        int index=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums[0].length;j++){
               if(nums[i][j]==1){
                count++;
               }
            }
            if (count>max){
                max=count;
                index=i;
            }
        }
        return index;
        
    }


    //------------------------------------------------------------------------------
   // main method
   public static void main(String[] args) {
    int arr[][]={{0, 1, 1, 1},
           {0, 0, 1, 1},
           {1, 1, 1, 1},
           {0, 0, 0, 0}};

           //calling the function
           int ans=rowWithMaxTime1(arr);
           System.out.println("Row with max1: "+ ans);
   }
}
