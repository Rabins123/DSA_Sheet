package Array;

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


    // main function 
    public static void main(String[] args) {
        
        int arr[]={1,3,4,2,2};

        //calling the function

        int ans1= duplicateUsingFloyas(arr);
        System.out.println("Duplicate Element Using Flyoad Algo is : "+ ans1);

        // int ans2= duplicateUsingHashSet(arr);
        // System.out.println("Duplicate Element is : "+ ans2);

        // int ans3= duplicateUsingSorting(arr);
        // System.out.println("Duplicate Element is : "+ ans3);

        // int ans4= duplicateUsingNesteLoop(arr);
        // System.out.println("Duplicate Element is : "+ ans4);

    }

  
}
