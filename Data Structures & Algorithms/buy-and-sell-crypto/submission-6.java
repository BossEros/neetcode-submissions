class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int left = 0;

        for(int right = 1; right < prices.length; right++){
            int profit = prices[right] - prices[left];

            if(prices[left] > prices[right])
                left = right;

            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }

}
