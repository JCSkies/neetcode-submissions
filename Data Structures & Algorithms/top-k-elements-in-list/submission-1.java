class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> numCount= new HashMap<>(); //maps number and frequency

        //get count of each
        for(int i = 0; i < nums.length; i++) {
            numCount.put(nums[i], numCount.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1]; // bound is up to nums.length so + 1 is important here
        // iterate through keyset
        // we will make buckets based on the FREQUENCY not the elements
        // make a new bucket if the frequency number hasn't appeared yet.
        // no matter what, add the element that matches the frequency

        for(int key: numCount.keySet()) {
            int freq = numCount.get(key); //gets the count value
            if(buckets[freq] == null) {
                buckets[freq] = new ArrayList<>(); //make a new bucket for non-existent buckets
            }

            buckets[freq].add(key); //the element will go into the bucket
        }

        // we will grab the top k elements now.
        // create an int array of size k (these are the top elements)
        // iterate backwards, start from the rightmost (top count buckets)
        // but iterate in order when iterating inside the bucket. this is still 
        // o(n) since we iterate once (o(n) and then through the bucket of size n, k times (o(n)))

        int[] result = new int[k];
        int index = 0; // this one will add to result array
        for(int j = buckets.length - 1; j >= 0 && index < k; j--) {
            if(buckets[j] == null) continue;
            for(int m = 0; m < buckets[j].size() && index <= k; m++) {
                result[index] = buckets[j].get(m);
                index++;
            }
        }

        return result;

    }
}
