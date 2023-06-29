package Array;


//three way partitioning

/*
 
Input: 
n = 5
A[] = {1, 2, 3, 3, 4}
[a, b] = [1, 2]
Output: 1
Explanation: One possible arrangement is:
{1, 2, 3, 3, 4}. If you return a valid
arrangement, output will be 1.


Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)
 */


public class threeWayPartitioning {
 
    public static void threeWayPartition(int array[], int a, int b)
    {
        // code here 
        int start=0;
        int end=array.length-1;
        
        int i=0;
        while(i<=end){
            
            if(array[i]<a){
                int temp=array[start];
                array[start]=array[i];
                array[i]=temp;
                i++;
                start++;
            }
            else if(array[i]>b){
                int temp=array[i];
                array[i]=array[end];
                array[end]=temp;
                
                end--;
            }
            else{
                i++;
            }
        }

        //print
        System.out.println("New Array is : ");
        for(int k=0;k<array.length;k++){
               System.out.print(array[k]+" ");
        }
    }
    //main function
    public static void main(String[] args) {
        int[] arr={10,5,2,3,20,30,6 ,7};
        int a=4;
        int b=8;
        //call the function


        threeWayPartition(arr, a, b);
    }
}
