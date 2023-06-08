package Array;

import java.util.Arrays;

public class MoveNegElement{
    
    //------------------------------Approach1-Using Sorting----------------------------
    //tc-
    //sc-
    public static void moveUsingSorting(int[]nums){
        Arrays.sort(nums);
        //print
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }





    //main function
    public static void main(String[] args) {
        int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };

        //print original array
        System.out.println("----------------------print original array----------------------");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println("----------------------Using Sorting Method-------------------------------");
        moveUsingSorting(arr);

    }
}