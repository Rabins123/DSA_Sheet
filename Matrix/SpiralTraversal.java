//spiral traversal of matrix
/*
 Input:  { {1,    2,   3,   4},
           {5,    6,   7,   8},
           {9,   10,  11,  12},
           {13,  14,  15,  16 }}
Output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
 */

package Matrix;

import java.util.ArrayList;

public class SpiralTraversal{
    
//-------------------//Approach1-Layer by layer//------------------------------------
//tc-0(m*n)
//sc-0(m*n)

public static ArrayList<Integer>spirallyTraversal(int arr[][], int r, int c){
  ArrayList<Integer>list=  new  ArrayList<Integer>();

  int startRow=0;
  int endRow=r-1;
  int startCol=0;
  int endCol=c-1;

  while(startRow<endRow && startCol< endCol){

    //from the starting row-->right direction
    for(int i=startCol;i<=endCol;i++){
        list.add(arr[startRow][i]);
    }
    startRow++;

    //from the end column-->bottom direction
    for(int i=startRow;i<=endRow;i++){
        list.add(arr[i][endCol]);
    }
     endCol--;

     //from the bottom row-->left direction
    for(int i=endCol;i>=startCol;i--){
        list.add(arr[endRow][i]);
    }
     endRow--;

     //from left column-->up direction
     for(int i=endRow;i>=startRow;i--){
        list.add(arr[i][startCol]);
    }
     startCol++;
  }
  return list;
}


//main function
public static void main(String[] args) {
  //2d arrray
      int[][]arr=    {  {1,    2,   3,   4},
                        {5,    6,   7,   8},
                        {9,   10,  11,  12},
                        {13,  14,  15,  16 }};

      int r=arr.length;
      int c=arr[0].length;

     //------------------------------------------------------------
     System.out.println("Elements in spiral order are: ");
     ArrayList<Integer>ans=spirallyTraversal(arr, r, c);
     System.out.print(ans);
}
}