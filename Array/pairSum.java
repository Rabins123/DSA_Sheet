package Array;

import java.util.HashMap;
import java.util.Map;

public class pairSum {
   
    
//--------------------------------------//USING HASHMAP//-----------------------------//-----------------------------
//tc-0(n)
//sc-0(n)
  public static int getPairsCountUsingHashMap(int[] arr, int n, int k) {
        // code here
        
       Map<Integer, Integer> frequencyMap = new HashMap<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int target = k - arr[i];
            if (frequencyMap.containsKey(target)) {
                count += frequencyMap.get(target);
            }
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }

        return count;
    }


//--------------------------------------//USING Brute Force//-----------------------------//-----------------------------
//tc-0(n*n)
//sc-0(1)

     private static int getPairsCountUsingBruteForce(int[] arr, int n, int k) {

          int count = 0;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == k) {
                    count++;
                }
            }
        }
        return count;
    }

//--------------------------------------//USING HashSet//-----------------------------//-----------------------------
//tc-0(n)
//sc-0(n)
//Note- do not handle duplicate case



    //main function
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, 1};
       int N = 4, K = 6;

       //call the function
       System.out.print("Using Hashmpap : ");
       int ans1=getPairsCountUsingHashMap(arr, N, K);
       System.out.println(ans1);

       System.out.print("Using BruteForce : ");
       int ans2=getPairsCountUsingBruteForce(arr, N, K);
       System.out.println(ans2);

    }


}
