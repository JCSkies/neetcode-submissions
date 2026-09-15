class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> solutions = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int threesome = nums[i] + nums[left] + nums[right];
                if(threesome < 0) {
                    left++;
                }
                else if (threesome > 0) {
                    right--;
                }
                else {
                    solutions.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left < right && nums[left] == nums[left + 1]) left++;
                    while(left < right && nums[right] == nums[right - 1]) right--; // get rid of duplicates
                    //we are still at the same value at the end, so iterate one more time
                    left++;
                    right--;
                }
            }
        } 
        return solutions;

    }

}