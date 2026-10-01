class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> anagrams = new HashMap<>();

        for (String str : strs) {

            int charArray[] = new int[26];
            for (char c : str.toCharArray()) {
                charArray[c - 'a']++;
            }

            // build the string from the counts

            String key = Arrays.toString(charArray);

            anagrams.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(anagrams.values());
    }
}
