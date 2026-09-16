class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> countNum = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            countNum.put(nums[i], countNum.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        for(int key : countNum.keySet()) {
            int freq = countNum.get(key); //gets frequency
            if(buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(key);

        }

        int[] result = new int[k];

        int index = 0;
        for(int i = buckets.length - 1; i >= 0 && index < k; i--) {
            if(buckets[i] == null) continue;

            for(int j = 0; j < buckets[i].size() && index <= k; j++) {
                result[index] = buckets[i].get(j);
                index++;
            }
        }

        return result;

    }
}
