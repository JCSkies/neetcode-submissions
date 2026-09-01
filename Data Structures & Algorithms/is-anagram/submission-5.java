class Solution {
    public boolean isAnagram(String s, String t) {
        boolean anagram = true;
        if (s.length() != t.length()) return false;
        // anagrams require same character length. we can check this instantly to see if its true.

        // now use arrays.sort(s), arrays.sort(t) to see if the characters match once we check side-by-side

        String[] charS = s.split("");
        Arrays.sort(charS);

        String[] charT = t.split("");
        Arrays.sort(charT);

        // for(int j = 0; j < charS.length; j++) {
        //     System.out.print(charS[j]);
        // }
        // System.out.println();
        //         for(int k = 0; k < charS.length; k++) {
        //     System.out.print(charT[k]);
        // }
        // System.out.println(); //tests to see if cases work. it does

        for(int i = 0; i < charS.length; i++) {
            if (!charS[i].equals(charT[i])) {
                anagram = false;
            } //if any mismatch, it means we dont have an anagram
        }
        return anagram; //base case. if all false cases fail then it must be true
    }
}
