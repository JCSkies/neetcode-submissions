class Solution {
    public int climbStairs(int n) {
        int one = 1, two = 0, temp = 0;
        

        for(int i = 0; i < n; i++) {
            temp = one; // store the past solution for two, which will take old one's solution
            one = one + two;
            two = temp;
        }

        return one;
        
    }
}
