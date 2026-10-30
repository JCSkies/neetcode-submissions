class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int current = 0;
        Set<Character> used = new HashSet<>();
        int j = 0;
        for(int i = 0; i < s.length(); i++) {
            while(used.contains(s.charAt(i))) {
                used.remove(s.charAt(j));
                j++;
                current--;
            }
            used.add(s.charAt(i));
            current++;
            if (current > longest) longest = current;
        }

        return longest;
    }
}
