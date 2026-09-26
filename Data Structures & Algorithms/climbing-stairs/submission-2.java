class Solution {
    public int climbStairs(int n) {

        int one = 1, two = 0;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            temp = one;
            one = one + two;
            two = temp;
        }

        return one;

        
    }
}
