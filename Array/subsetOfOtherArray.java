package Array;

import java.util.HashSet;

//Array Subset of another array

/*
 Input:
a1[] = {1, 2, 3, 4, 4, 5, 6}
a2[] = {1, 2, 4}
Output:
Yes
Explanation:
a2[] is a subset of a1[]

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

 */

public class subsetOfOtherArray {


    //----------------------------------Brute force------------------------------------------------------
    //tc-0(n*m)
    //sc-0(1)
    private static boolean isSubsetOfOther1(int[] a1, int[] a2) {

        for(int i=0;i<a2.length;i++){
            boolean ans=false;
            for(int j=0;j<a1.length;j++){
                if(a2[i]==a1[j]){
                    ans=true;
                    break;
                }
            }
            if(!ans){
                return ans;
            }
        }
        return true;
    }

    //----------------------------------Hashset------------------------------------------------------
    //tc-0(n)
    //sc-0(n)
private static boolean isSubsetOfOther2(int[] a1, int[] a2){
    HashSet<Integer> set=new HashSet<>();
    for(int i=0;i<a1.length;i++){
        set.add(a1[i]);
    }
     
    boolean flag=true;
    for(int j=0;j<a2.length;j++){
        if(!set.contains(a2[j])){
            flag= false;
        }
    }
    return flag;

}

//----------------------------------Hashset------------------------------------------------------
    //tc-0(n)
    //sc-0(n)
    
    // main function
    public static void main(String[] args) {
        int a1[] = { 1, 2, 3, 4, 4, 5, 6 };
        int a2[] = { 1, 2, 9 };
        int a3[] = { 1, 2, 4 };


        //call the function
         boolean ans1=isSubsetOfOther1(a1,a2);
         System.out.println("One is subset of other : "+(ans1? "Yes it is subset of other": "NO it is not subset of other"));


         System.out.println();
         boolean ans2=isSubsetOfOther2(a1,a3);
         System.out.println("One is subset of other : "+(ans2? "Yes it is subset of other": "NO it is not subset of other"));
    }

    
}
