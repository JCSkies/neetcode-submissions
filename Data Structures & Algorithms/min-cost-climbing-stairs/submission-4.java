class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int first = 0;
        int second = 0;

        for(int i = cost.length - 1; i >= 0; i--) { 
            // if (cost[i+1] == null) first = 0 else first = cost[i+1];
            // if (cost[i+2] == null) second = 0 else second = cost[i+1];
            first = (i + 1 < cost.length) ? cost[i + 1] : 0;
            second = (i + 2 < cost.length) ? cost[i + 2] : 0;
            cost[i] += Math.min(first, second);
        }

        return Math.min(cost[0], cost[1]);

    }
}
