package Array;

//best time to buy and sell stock

/*
 Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 */

public class BestTimeToBUY {
      public static int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        
        int profit=0;
        int min=prices[0];
        for(int i=0;i<prices.length;i++){
             min=Math.min(min, prices[i]);
            profit =Math.max(profit,(prices[i]-min) );
        }
        return profit;
    }

    //main function
    public static void main(String[] args) {
        int [] arr={7,1,5,3,6,4 };

        //call the function
        int ans1=maxProfit(arr) ;
        System.out.println(ans1);
    }
}
