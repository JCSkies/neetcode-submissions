class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // anagrams are found through character count. count frequency of each character and store in an array?

        Map<String, List<String>> groups = new HashMap<>();


        
        for(String str: strs) {
            int[] characterCount = new int[26];

            for(char c: str.toCharArray()) {
                characterCount[c - 'a']++;
            }

            String key = Arrays.toString(characterCount);

            groups.computeIfAbsent(key, k -> new ArrayList<>())
            .add(str);
        }

        return new ArrayList<>(groups.values());

    }
}
