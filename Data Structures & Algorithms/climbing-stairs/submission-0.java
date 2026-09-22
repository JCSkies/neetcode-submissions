class Solution {
    public int climbStairs(int n) {
        int one = 1;
        int two = 1;

        for(int i = 0; i < n - 1; i++) {
            int temp = one; //store the current to be shifted here
            one = one + two; // add the two together (using old solutions to build new ones)
            two = temp; // two is now the previous problem to current answer;
        }
        return one; //now we used the bottom-up approach (smallest subproblem to largest) and caught the overlapping subproblems, captured them into a simple sequence.
    }
}
