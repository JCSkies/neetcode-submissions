class Solution {
    public int[] twoSum(int[] nums, int target) {
        // get all values in a hashmap. we can subtract the target with the current value in the array and get a remaining needed. afterwards, check the hashset o(1) to see if the value is there.

        Map<Integer, Integer> valuesIndexes = new HashMap<>();
        int needed = 0;


        for(int i = 0; i < nums.length; i++) {
            needed = target - nums[i];
            if (valuesIndexes.containsKey(needed)) {
                int[] solution = {valuesIndexes.get(needed), i};
                return solution;
            }
            else {
                if(!valuesIndexes.containsKey(nums[i])){
                    valuesIndexes.put(nums[i], i);
                }
            }

        }
        return null;
        
    }
}
