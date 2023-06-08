//gfg problem
//find union of two sorted array
/*Input:
5 3
1 2 3 4 5
1 2 3
Output: 
5
Expected Time Complexity : O(n+m)
Expected Auxilliary Space : O(n+m)
*/

package Array;
import java.util.ArrayList;
import java.util.HashSet;

public class UnionOfTwoSortedArray {

    //-----------------------------Approach1-using Arraylist------------------------------
    //tc-O(m + n)
    //sc-O(m + n)
    public static ArrayList<Integer> unionOfArrayUsingArraylist(int nums1[], int nums2[]){
     ArrayList<Integer> list=new ArrayList<>();
     int i=0,j=0;
     while(i<nums1.length && j<nums2.length){
        if(nums1[i]==nums2[j]){    // Add either element to the union array
           list.add(nums1[i]);
           i++;j++;
        }
        else if(nums1[i]>nums2[j]){
            list.add(nums2[j]);   // Add the smaller element from arr2 to the union array
            j++;
        }
        else{
            list.add(nums1[i]);   // Add the smaller element from arr1 to the union array
            i++;
        }
      }
      while(i<nums1.length){   // Add remaining elements from arr1, if any
        list.add(nums1[i]);
            i++;
      }
      while(i<nums1.length){     // Add remaining elements from arr2, if any
        list.add(nums1[i]);
            i++;
      }

      return list;
    }

    //-----------------------------Approach2-using Hashset------------------------------
    //tc- O(m + n)
    //sc-  O(m + n)
    public static HashSet<Integer> unionOfArrayUsingHashset(int nums1[], int nums2[]){
        HashSet<Integer> set=new HashSet<>();
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
           if(nums1[i]==nums2[j]){    // Add either element to the union array
              set.add(nums1[i]);
              i++;j++;
           }
           else if(nums1[i]>nums2[j]){
               set.add(nums2[j]);   // Add the smaller element from arr2 to the union array
               j++;
           }
           else{
               set.add(nums1[i]);   // Add the smaller element from arr1 to the union array
               i++;
           }
         }
         while(i<nums1.length){   // Add remaining elements from arr1, if any
           set.add(nums1[i]);
               i++;
         }
         while(i<nums1.length){     // Add remaining elements from arr2, if any
           set.add(nums1[i]);
               i++;
         }
   
         return set;
    }


    //-----------------------------Approach3-using Hashset------------------------------
    //tc-
    //sc-


    //main function
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,2,3};

       System.out.println("------------------Using ArrayList---------------------");
        ArrayList<Integer> ans1=unionOfArrayUsingArraylist(arr1, arr2);
        System.out.println("Union of the two arrays: " + ans1);

        System.out.println();
        System.out.println("------------------Using Hashset---------------------");
        HashSet<Integer> ans2=unionOfArrayUsingHashset(arr1, arr2);
        System.out.println("Union of the two arrays: " + ans2);
    }
    
}
