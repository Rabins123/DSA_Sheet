package Array;

//Array Rotation - Problem: Reverse an array 
// - Sample Input: Array: [1, 2, 3, 4, 5]
// - Sample Output: Rotated Array: [5, 4, 3, 2, 1]



public class reverseArray{

// ------------------------------Approach:1 Using Two pointer----------------------------
// - TC: O(n)
// - SC: O(1)
public static int[] reverseArrayUsingTwoPointer(int [] nums){
     int s=0;
     int e=nums.length-1;
     while(s<e){
        int temp=nums[s];
        nums[s]=nums[e];
        nums[e]=temp;
        s++;e--;
     }
     return nums;
}

    public static void main (String[] args){
        int [] arr={1,2,3,4,5,6,7};

        System.out.println("Original Array:");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
       
        System.out.println();
        System.out.println("______________________________________________________________ ");
        // calling each function from here
        System.out.println("Reversing the array using two pointer: ");
        int[] result1=reverseArrayUsingTwoPointer(arr);
        for(int j=0; j<result1.length;j++){
            System.out.print(result1[j]+" ");
        }
    }
}