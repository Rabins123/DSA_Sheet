package Array;

//subarray sum 0

/*
 Input:
5
4 2 0 1 6

Output: 
Yes

Explanation: 
0 is one of the element 
in the array so there exist a 
subarray with sum 0.

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).
 */


public class SubArraySum0 {
  
   //-------------------------------------------------------------Using Brute force------------------------------------------------
   //tc-0(n*n)
   //sc -0(1)
    public static boolean findsum1(int arr[],int n){
        int sum=0;
         for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum =sum+arr[j];
            }
            if(sum==0){
                return true;
            }
         }
         return false;

    }
    
        
     //-------------------------------------------------------------Using HashSET-----------------------------------------------
   //tc-0(n)
   //sc -0(n)

   public static boolean findsum2(int arr[],int n){

   }
    

    //main function
    public static void main(String[] args) {
        int n=5;
         int [] arr={4, 2, 0, 1, 6};

        //call the function
       boolean ans1=findsum1(arr,n);
       System.out.println(ans1);
       System.out.println();
       
        boolean ans2=findsum2(arr,n);
       System.out.println(ans2);
       System.out.println();

       
    }
}