package Array;

//Array Reverse Problem: Reverse an array 
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


// ------------------------------Approach:2 Using single pointer----------------------------
// - TC: O(n)
// - SC: O(1) more optimised than first
public static int[] reverseArrayUsingSinglePointer(int [] nums){
    int n=nums.length;
    for(int i=0;i<n/2;i++){
       int temp=nums[1];
       nums[1]=nums[n-1-i];
       nums[n-1-i]=temp;
    }
    return nums;
}

// ------------------------------Approach:3 Using recursion----------------------------
// - TC: O(n)
// - SC: O(n) 
public static int[] reverseArrayUsingRecursion(int [] nums , int s, int e){

    if(s>e){
        return nums;
    }
    int temp=nums[s];
    nums[s]=nums[e];
    nums[e]=temp;
    s++;e--;
    return reverseArrayUsingRecursion(nums , s,  e);
    
    
}


//print function
public static void print(int [] result){
    for(int j=0; j<result.length;j++){
        System.out.print(result[j]+" ");
    }
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
        int[] ans1=reverseArrayUsingTwoPointer(arr);
        print(ans1);

        System.out.println();
        System.out.println("______________________________________________________________ ");
        // calling each function from here
        System.out.println("Reversing the array using two pointer: ");
        int[] ans2=reverseArrayUsingSinglePointer(arr);
        print(ans2);

        System.out.println();
        System.out.println("______________________________________________________________ ");
        // calling each function from here
        System.out.println("Reversing the array using two pointer: ");
        int[] ans3=reverseArrayUsingRecursion(arr, 0, arr.length-1);
        print(ans3);
    }
}