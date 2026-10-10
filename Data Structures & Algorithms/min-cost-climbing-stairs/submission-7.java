class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // this is a top-down approach since we are finding the minimimum cost at the root from solving other subproblems. best way is to solve backwards. this is because the same solution can appear multiple times in different parts of the tree, so caching the solution by catching them at the subproblem level can easily be used to find the min path each way all the way to the root. 
        int first = 0;
        int second = 0;

        for(int i = cost.length - 1; i >= 0; i--) {
            first = (i + 1 < cost.length) ? cost[i + 1] : 0; // if i + 1 is still >= cost.length then it doesn't exist yet/can't be calculated. set at 0
            second = (i + 2 < cost.length) ? cost[i + 2] : 0; //same here
            cost[i] += Math.min(first, second); // this is the cached solution where cost[i] is the root at the current subproblem, using cached solutions from the two below it.
        }

        return Math.min(cost[0], cost[1]);

    }
}
