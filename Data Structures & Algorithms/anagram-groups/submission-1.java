class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // anagrams are found through character count. count frequency of each character and store in an array?

//create the hashmap of type strings but also contains list of strings

        Map<String, List<String>> anagrams = new HashMap<>();

// iterate through the list of strings

        for(String str: strs) {

// get an array of int type counting each character
            int[] charArray = new int[26];
            for(char c: str.toCharArray()) {
                charArray[c - 'a'] ++;
            }

// Turn the character array into a string again as a key

            String key = Arrays.toString(charArray);
//check in hashmap if the key is not in the hashmap already and create new arraylist inside. if not continue but always add the string

            anagrams.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(anagrams.values());
    }
}
