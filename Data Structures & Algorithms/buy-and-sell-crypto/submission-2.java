class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = Integer.MAX_VALUE;
        int max = 0;
        int current = 0;
        for(int i = 0; i < prices.length; i++) {
            if (prices[i] < minBuy) {
                minBuy = prices[i];
                current = i;
            }
            else {
                max = Math.max(max, prices[i] - minBuy);
            }
        }
        return max;
        
    }
}
