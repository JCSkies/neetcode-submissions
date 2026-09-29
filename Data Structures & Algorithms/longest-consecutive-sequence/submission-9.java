class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        Set<Integer> items = new HashSet<>();

        for(int n : nums) {
            items.add(n);
        }

        for(int n : nums) {
            if(!items.contains(n - 1)) {
                int current = 0;
                while (items.contains(n + current)) {
                    current++;
                }
                longest = Math.max(longest, current);
            }

            
        }


        return longest;
    }
    
}
