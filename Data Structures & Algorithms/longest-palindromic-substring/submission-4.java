class Solution {
    public String longestPalindrome(String s) {
        String longest = "";

        String longestEven = longestEven(s);
        String longestOdd = longestOdd(s);
        if (longestEven.length() > longestOdd.length()) {
            longest = longestEven;
        }
        else {
            longest = longestOdd;
        }

        return longest;
    }


    public String longestEven(String s) {
        String longest = "";
        int j = 0, k = 0;

        for(int i = 0; i < s.length(); i++) {
            j = i;
            k = i + 1; 
            //even means we can't start at the middle; use i + 1 as a start for k
            while (j >= 0 && k < s.length()) {
                if (s.charAt(j) == s.charAt(k)) {
                    String substring = s.substring(j, k + 1);
                    if (substring.length() > longest.length()) longest = substring;
                }
                else {
                    break;
                }
                j--;
                k++;
            }

        }

        return longest;

    }

    public String longestOdd(String s) {
        String longest = "";
        int j = 0, k = 0;

        for(int i = 0; i < s.length(); i++) {
            j = i;
            k = i; 
            while (j >= 0 && k < s.length()) {
                if (s.charAt(j) == s.charAt(k)) {
                    String substring = s.substring(j, k + 1);
                    if (substring.length() > longest.length()) longest = substring;
                }
                else {
                    break;
                }
                j--;
                k++;
            }

        }

        return longest;
    }
}
