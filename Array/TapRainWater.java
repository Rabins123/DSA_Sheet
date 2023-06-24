package Array;

public class TapRainWater {

    // -------------------------------------------------Using Brute force
    // approach---------------------------------
    // tc- O(N2).
    // sc-O(1)
    public static int trapRainwaterUsingBruteforce(int arr[]) {
        int n = arr.length;
        // code here
        int res = 0;

        // For every element of the array
        for (int i = 1; i < n - 1; i++) {

            // Find the maximum element on its left
            int left = arr[i];
            for (int j = 0; j < i; j++)
                left = Math.max(left, arr[j]);

            // Find the maximum element on its right
            int right = arr[i];
            for (int j = i + 1; j < n; j++)
                right = Math.max(right, arr[j]);

            // Update the maximum water
            res = res + (Math.min(left, right) - arr[i]);
        }

        return res;
    }

    // -------------------------------------------------Using Pre
    // calculation---------------------------------
    // tc-0(n)
    // sc-0(n)
    public static int trapRainwater(int[] heights) {
        int totalWater = 0;
        int n = heights.length;

        int[] leftMax = new int[n]; // Stores the maximum height encountered from the left side
        int[] rightMax = new int[n]; // Stores the maximum height encountered from the right side

        // maximum heightfrom the left at each index
        leftMax[0] = heights[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], heights[i]);
        }

        // maximum height from the right at each index
        rightMax[n - 1] = heights[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], heights[i]);
        }

        // Calculate the trapped water at each index
        for (int i = 0; i < n; i++) {
            int minMaxHeight = Math.min(leftMax[i], rightMax[i]);
            totalWater += minMaxHeight - heights[i];
        }

        return totalWater;
    }

    // -------------------------------------------------Using two pointer---------------------------------
    // tc-0(n)
    // sc-0(1)
    public static int trapRainwater3(int[] arr) {
         int n=arr.length;
        // code here
        // Indices to traverse the array
        int left = 0;
        int right = n-1;
     
        // To store Left max and right max 
        // for two pointers left and right
        int l_max = 0;
        int r_max = 0;
     
        // To store the total amount 
        // of rain water trapped
        int result = 0;
        while (left <= right)
        {
     
          // We need check for minimum of left 
          // and right max for each element
          if(r_max <= l_max)
          {
     
            // Add the difference between 
            // current value and right max at index r
            result += Math.max(0, r_max-arr[right]);
     
            // Update right max
            r_max = Math.max(r_max, arr[right]);
     
            // Update right pointer
            right -= 1;
          }
          else
          { 
     
            // Add the difference between 
            // current value and left max at index l
            result += Math.max(0, l_max-arr[left]);
     
            // Update left max
            l_max = Math.max(l_max, arr[left]);
     
            // Update left pointer
            left += 1;
          }
        }
        return result;
    }
    

    public static void main(String[] args) {
        // Test case
        int[] heights = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int trappedWater1 = trapRainwater(heights);
        System.out.println("Trapped water: " + trappedWater1);

        int trappedWater2 = trapRainwaterUsingBruteforce(heights);
        System.out.println("Trapped water: " + trappedWater2);

        int trappedWater3 = trapRainwater(heights);
        System.out.println("Trapped water: " + trappedWater3);
    }
}
