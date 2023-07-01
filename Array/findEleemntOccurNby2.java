package Array;

import java.util.*;


//Given Array of size n and a number k, find all elements that appear more than n/k times

/*
 Input: arr[] = {3, 1, 2, 2, 1, 2, 3, 3}, k = 4
Output: {2, 3}
 */

public class findEleemntOccurNby2 {

    // ---------------------------------usinghashmap-------------------------------------
    // tc- O(N)
    // sc- O(N)
    public static void morethanNdK1(int a[], int n, int k) {
        int x = n / k;

        HashMap<Integer, Integer> y = new HashMap<>();

        // count the frequency of each element.
        for (int i = 0; i < n; i++) {
            // is element doesn't exist in hash table
            if (!y.containsKey(a[i]))
                y.put(a[i], 1);

            // if element does exist in the hash table
            else {
                int count = y.get(a[i]);
                y.put(a[i], count + 1);
            }
        }

        for (Map.Entry m : y.entrySet()) {
            Integer temp = (Integer) m.getValue();
            if (temp > x)
                System.out.println(m.getKey());
        }
    }

    // main function
    public static void main(String[] args) {
        int arr[] = { 3, 1, 2, 2, 1, 2, 3, 3 };
        int k = 4;

        // call the function
         morethanNdK1(arr, arr.length, k);
    }
}
