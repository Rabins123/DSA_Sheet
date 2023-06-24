package Array;

public class TapRainWater {


    //-------------------------------------------------Using Pre calculation---------------------------------
    //tc-0(n)
    //sc-0(n)
    public static int trapRainwater(int[] heights) {
        int totalWater = 0;
        int n = heights.length;

        int[] leftMax = new int[n]; // Stores the maximum height encountered from the left side
        int[] rightMax = new int[n]; // Stores the maximum height encountered from the right side

        // maximum heightfrom the left  at each index
        leftMax[0] = heights[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], heights[i]);
        }

        //maximum height from the right at each index
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

    public static void main(String[] args) {
        // Test case
        int[] heights = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int trappedWater = trapRainwater(heights);
        System.out.println("Trapped water: " + trappedWater);
    }
}
