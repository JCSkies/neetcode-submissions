class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        //key word: index 1 and index 2 CANNOT BE EQUAL. so use a hashset and first make sure the number is not in the set either.

        Map<Integer, Integer> numsIndexes = new HashMap<>(); //map is (elements, indexes)

        for(int i = 0; i < numbers.length; i++) {
            int needed = target - numbers[i]; // we check hashset for this number
            if(numsIndexes.containsKey(needed)) {
                if (i == numsIndexes.get(needed)) continue; // skip same-value elements
                return new int[] {numsIndexes.get(needed) + 1, i + 1};
            } 
            else {
                numsIndexes.put(numbers[i], i);
            }
        }

        return null;

        

    }
}
