class Solution {
    public int rob(int[] nums) {

        if (nums.length == 1) return nums[0];
        int rob1 = 0, rob2 = 0;
        int temp = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            temp = Math.max(nums[i] + rob1, rob2);
            rob1 = rob2;
            rob2 = temp;
            System.out.println(rob2 + " rob2");
        }

        int rob3 = 0, rob4 = 0;

        for(int j = nums.length - 1; j > 0; j--) {
            temp = Math.max(nums[j] + rob3, rob4);
            rob3 = rob4;
            rob4 = temp;
            System.out.println(rob4 + " rob4");
        };

        return Math.max(rob2, rob4);
    }
}
