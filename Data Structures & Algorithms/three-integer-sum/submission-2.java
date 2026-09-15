class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> solutions = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++) {
            int a = nums[i];

            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right) {
                int threesum = a + nums[left] + nums[right];
                if(threesum == 0) {
                    solutions.add(Arrays.asList(a, nums[left], nums[right]));
                    while(left < right && nums[left] == nums[left + 1]) left++; //get rid of duplicates
                    while(left < right && nums[right] == nums[right - 1]) right--;
                    //move one more
                    left++;
                    right--;

                    
                }
                else if (threesum < 0) {
                    left++;
                }
                else {
                    right--;
                }

            }
        }
                return solutions;
    }


}