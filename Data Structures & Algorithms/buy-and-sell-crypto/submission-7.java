class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int left = 0, right = 1;

        while(right < prices.length){
            int currentProfit = prices[right] - prices[left];

            if(prices[right] > prices[left])
                maxProfit = Math.max(maxProfit, currentProfit);
            else
                left = right;
            
            right++;
        }

        
        return maxProfit;
    }

}
