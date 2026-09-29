class Solution {
    public int[] twoSum(int[] numbers, int target) {
    
        Map<Integer, Integer> elemIndex = new HashMap<>();

        for(int i = 0; i < numbers.length; i++) {
            int needed = target - numbers[i]; // find needed value

            if (elemIndex.containsKey(needed)) {
                if (elemIndex.containsValue(i)){
                    continue;
                }
                else {
                    return new int[]{elemIndex.get(needed) + 1, i + 1};
                }
            }
            else {
                elemIndex.put(numbers[i], i);
            }
        }
        
        return null;

    }
}
