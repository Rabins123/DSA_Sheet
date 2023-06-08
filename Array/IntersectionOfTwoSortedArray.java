package Array;

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfTwoSortedArray {
    
    //-----------------------------Approach1-Using Arraylist------------------------------
    //tc- O(m + n)
    //sc-O(1) 
public static ArrayList<Integer>IntersectionOfSortedArrayUsingArrayList(int[]nums1,int nums2[]){
    ArrayList<Integer> list= new ArrayList<>();
    int i=0;   // Pointer for arr1
    int j=0;   // Pointer for arr2
    while(i<nums1.length && j<nums2.length){

        if(nums1[i]==nums2[j]){
            list.add(nums1[i]);
            i++;j++;
        }
        else if(nums1[i]>nums2[j]){
            j++;
        }
        else{
            i++;
        }
    }
    return list;
}


    //main method
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,2,3};

       System.out.println("------------------Using ArrayList---------------------");
       ArrayList<Integer>ans1=IntersectionOfSortedArrayUsingArrayList(arr1, arr2);
        System.out.println("Intersection of the two arrays: " + ans1);
    }
}
