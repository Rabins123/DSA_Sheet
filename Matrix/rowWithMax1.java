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
    
    //--------------------------Approach1-Using for loop(Brute Force)-----------------------------------------------------
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
         if(max==0){
            return -1;
        }
        else{
            return index;
        }
        
    }

    //------------------------------Approach2-->Binary Search-------------------------------
    //finding first index of 1 in each row
    //tc-
    //sc-

     //------------------------------Approach3-->-------------------------------
    //finding first index of 1 in each row
    //tc-log(m+n)
    //sc-

public static int rowWithMaxTime1Approach3(int[][] nums){
        int row=-1;            //if not exist return-1
        int col=nums[0].length-1;
        //traversing row by row
        for(int i=0;i<nums.length;i++){
           //traversing column from right to left
            for(int j= col;j>=0;j--){
               if(nums[i][j]==1){
                row=i;
                //will not see same column again
                col--;
               }
               //if encounter zero 
               else{
                break;
               }
            }
        }
        return row;
        
    }

    //------------------------------------------------------------------------------
   // main method
   public static void main(String[] args) {
    int arr[][]={{0, 1, 1, 1},
           {0, 0, 1, 1},
           {1, 1, 1, 1},
           {0, 0, 0, 0}};

           //calling the function1
           int ans1=rowWithMaxTime1(arr);
           System.out.println("Row with max1 using Approach1: "+ ans1);

            //calling the function3
           int ans3=rowWithMaxTime1(arr);
           System.out.println("Row with max1 using Approach3: "+ ans3);
   }
}
