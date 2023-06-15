package Array;

//Given an array, rotate the array by one position in clock-wise direction.
/*
Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4
 */


public class CycallyRotateArrayByOne {

    //--------------------Approach1--------------------------------------
    public static void rotateArray(int nums[]){
        int end=nums[nums.length-1];
        int i=0;
        for(i=nums.length-1;i>0;i--){
            nums[i]=nums[i-1];
        }
        nums[0]=end;

        //print the array first
        for(int k=0;k<nums.length;k++){
            System.out.print(nums[k]+"  ");

        }
    }


    //main function
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};

        System.out.println("-------------------------Original Array----------------------");
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");

        }

        System.out.println();
        System.out.println("-------------------------New Array---------------------------");
        rotateArray(arr);

    }
    
}
