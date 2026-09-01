class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> foundNums = new HashSet<>(); // we will do o(1) searching through hashset, seeing if a number is already contained in the set

        for(int i = 0; i < nums.length; i++) {
            if (foundNums.contains(nums[i])) {
                return true;
            }
            else {
                foundNums.add(nums[i]);
            }
        }
        

        return false; //base case. if for loop finishes, then no duplicate was found
    }
}