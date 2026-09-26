class Solution {
    public int rob(int[] nums) {
        int rob1 = 0, rob2 = 0;

        int temp = 0;

        for(int i = 0; i < nums.length; i++) {
            temp = Math.max(nums[i] + rob1, rob2);
            System.out.println(rob1 + " ; " + rob2);
            rob1 = rob2;
            rob2 = temp;    
        }

        return rob2;
    }
}
