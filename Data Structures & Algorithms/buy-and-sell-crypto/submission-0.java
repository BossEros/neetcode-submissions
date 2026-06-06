class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;

        for(int left = 0; left < prices.length - 1; left++){
            int right = left + 1;
            while(right < prices.length){
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(profit, maxProfit);
                right++;
            }
        }
        
        if(maxProfit <= 0)
            return 0;
        else
            return maxProfit;

    }
}
