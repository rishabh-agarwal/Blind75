package SlidingWindow;

/**
 * Leetcode: 121
 **/
public class BuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currProfit;
        int len = prices.length;
        for(int buy=0; buy<len-1; buy++){
            int sell = buy+1;
            while (sell < len) {
                currProfit = prices[sell] - prices[buy];
                maxProfit = Math.max(currProfit, maxProfit);
                sell++;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{10,1,5,6,7,1}));
    }
}
