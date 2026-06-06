class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int maxProfit = 0;

        for(int right = 0; right < prices.length; right++){
            int profit = prices[right] - prices[left];

            if(prices[right] > prices[left])
                maxProfit = Math.max(maxProfit, profit);
            else
                left = right;
        }
        return maxProfit;
    }

}
