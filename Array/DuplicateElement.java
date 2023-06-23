package Array;

import java.util.HashSet;

//Find the Duplicate Number

/*
Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
 */ 

public class DuplicateElement {

    //------------------------------Using floyad Warshall Algo----------------//----------------------------//---------------------
    //tc-0(n)
    //sc-0(1)
   
      public static int duplicateUsingFloyas(int[] arr) {
         int slow=arr[0];
         int fast=arr[0];

         while(true){
            slow=arr[slow];
            fast=arr[arr[fast]];

            if(slow==fast){
                break;
            }

         }

         slow=arr[0];
         while(slow !=fast){
            slow=arr[slow];
            fast=arr[fast];
         }

         return slow;
    }


    //------------------------------Using HashSet----------------//----------------------------//---------------------
    //tc-0(n)
    //sc-0(n)
   private static int duplicateUsingHashSet(int[] arr) {
        HashSet<Integer>set=new HashSet<>();
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                ans=arr[i];
                break;
            }
            set.add(arr[i]);
        }
        
        return ans;
    }


    //------------------------------Using HashSet----------------//----------------------------//---------------------
    //tc-0(n)
    //sc-0(n)
     public static int duplicateUsingSorting (int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }

        return len;
    }

    // main function 
    public static void main(String[] args) {
        
        int arr[]={1,3,4,2,2};

        //calling the function

        int ans1= duplicateUsingFloyas(arr);
        System.out.println("Duplicate Element Using Flyoad Algo is : "+ ans1);
        System.out.println();

        int ans2= duplicateUsingHashSet(arr);
        System.out.println("Duplicate Element Using Hashset is : "+ ans2);
        System.out.println();

        int ans3= duplicateUsingSorting(arr);
        System.out.println("Duplicate Element Using Nested loop is : "+ ans3);
         System.out.println();

        // int ans4= duplicateUsingNesteLoop(arr);
        // System.out.println("Duplicate Element is : "+ ans4);

    }


    

  
}
