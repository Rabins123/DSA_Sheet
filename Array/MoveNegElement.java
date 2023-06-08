package Array;

import java.util.Arrays;

public class MoveNegElement{
    
    //------------------------------Approach1-Using Sorting----------------------------
    //tc-nlogn
    //sc-1
    public static void moveUsingSorting(int[]nums){
        Arrays.sort(nums);
        //print
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }

    //------------------------------Approach2-Using quick sort partitioning method ----------------------------
    //tc-
    //sc-

    //------------------------------Approach3-two pointer method ----------------------------
    //tc-n
    //sc-1
    public static void moveUsingTwoPointer(int nums3[]){
        int start=0;
        int end=nums3.length-1;
        while(start<end){
            if(nums3[start]<0 && nums3[end]<0){
                start++;
            }
            else if(nums3[start]>0 && nums3[end]<0){
                int temp=nums3[start];
                nums3[start]=nums3[end];
                nums3[end]=temp;
                start++;
                end--;
            }
            else if(nums3[start]<0 && nums3[end]>0){
                start++;
                end--;
            }
            else{
                end--;
            }   
        }
        //print
        for(int i=0;i<nums3.length;i++){
            System.out.print(nums3[i]+" ");
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

        System.out.println();
        System.out.println("----------------------Using Two pointer Method-------------------------------");
        moveUsingTwoPointer(arr);

    }
}