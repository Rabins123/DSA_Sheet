package Array;

import java.util.Arrays;

public class Sort012s {

    // -----------------------Approach1- Dutch National Flag
    // Problem---------------------------------------
    // tc- O(n)
    // sc- O(1)
    public static void sort012UsingDNF(int a[], int n) {
        int low = 0;
        int mid = 0;
        int high = a.length - 1;
        while (mid <= high) {
            if (a[mid] == 0) {
                // swap mid and low
                // swap(a,low, mid);
                int temp = a[mid];
                a[mid] = a[low];
                a[low] = temp;
                low++;
                mid++;
            } 
            else if (a[mid] == 1) {
                mid++;
            } 
            else if(a[mid]==2){
                // swap mid and high
                // swap(a,mid, high);
                int temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                high--;
            }
           
        }
         // printing
         for (int k=0;k<n;k++) {
            System.out.print(a[k]+ " ");
        }
    }
    // private static void swap(int[] nums, int i, int j) {
    // int temp = nums[i];
    // nums[i] = nums[j];
    // nums[j] = temp;
    // }

    // -----------------------Approach1-Using
    // counter---------------------------------------
    // tc- O(n)
    // sc- O(1)
    public static void sort012UsingCounter(int a[], int n){
           int count0=0;
           int count1=0;
        //    int count2=0;

           //counting
           for(int i=0;i<n-1;i++){
            if(a[i]==0){
                count0++;

            }
            else if(a[i]==1){
                count1++;
                
            }
            else{
                // count2++;
                
            }
        }
          //reconstructing the array
          for(int j=0;j<n-1;j++){
            if(j<count0){
                a[j]=0;
                count1++;
                
            }
            else if(j<count1){
                a[j]=1;
                // count2++;
            }
            else{
                a[j]=2;
            }

          }

          for (int num : a) {
            System.out.print(num+ " ");
          }
           
    }

    // -----------------------Approach1- Using sorting
    // method---------------------------------------
    // tc- O(nlogn)
    // sc- O(1)
    public static void sort012UsingSorting(int a[], int n) {

        // sort the array
        Arrays.sort(a);
        for (int num : a) {
            System.out.print(num + " ");
        }

    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 0, 2, 0, 1, 2, 0, 0, 2 };
        int n = nums.length;

        System.out.println("-------------------------Original Array:---------------------------- ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println("-------------------------Sorted Array Using DNF------------------------------");
        sort012UsingDNF(nums, n);

        System.out.println();
        System.out.println("-------------------------Sorted Array Using Counter------------------------------");
        sort012UsingCounter(nums, n);

        System.out.println();
        System.out.println("-------------------------Sorted Array Using Sorting------------------------------");
        sort012UsingSorting(nums, n);

    }
}
