package Array;

public class Sort012s {

    //-----------------------Approach1- Dutch National Flag Problem---------------------------------------
    //tc- O(n)
    //sc- O(1)
    public static void sort012UsingDNF(int a[], int n){
          int low=0;
          int mid=0;
          int high=a.length-1;
          while(mid<=high){
                if(a[mid]==0){
                    //swap mid and low
                    // swap(a,low, mid);
                    int temp = a[mid];
                    a[mid] = a[low];
                    a[low] = temp;
                    low++;
                    mid++;
                }
                else if(a[mid]==1){
                    mid++;
                }
                else{
                    //swap mid and high
                    // swap(a,mid, high);
                    int temp = a[mid];
                    a[mid] = a[high];
                    a[high] = temp;
                    high--;       
                }
          }
          
          for(int i=0;i<n-1;i++){
            System.out.print(a[i]+" ");
          }
    }
    // private static void swap(int[] nums, int i, int j) {
    //     int temp = nums[i];
    //     nums[i] = nums[j];
    //     nums[j] = temp;
    // }



     //-----------------------Approach1-Using counter---------------------------------------
    //tc- O(n)
    //sc- O(1)
    // public static void sort012UsingCounter(int a[], int n){
           
    // }

     //-----------------------Approach1- Using sorting method---------------------------------------
    //tc- O(nlogn)
    //sc- O(1)
    // public static void sort012UsingSorting(int a[], int n){

    // }



    public static void main(String[] args) {
        int nums[]={0,1,0,2,0,1,2,0,0,2};
        int n=nums.length;

        System.out.println("Sorted Array: ");
        sort012UsingDNF(nums, n);
    }
}
