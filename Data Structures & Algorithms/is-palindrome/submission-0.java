class Solution {
    public boolean isPalindrome(String s) {
        boolean currentStatus = true;
        int left = 0;
        int right = s.length() - 1;
        char lowerLeft = 'a';
        char lowerRight = 'a';

        //first pass, get all characters left to right and only get alphanumerics
        
        while (left < right) {
            char charLeft = s.charAt(left);
            if(Character.isLetterOrDigit(charLeft)) {
                lowerLeft = Character.toLowerCase(charLeft);
            }
            else {
                left++;
                continue;
            }

            char charRight = s.charAt(right);
            if(Character.isLetterOrDigit(charRight)) {
                lowerRight = Character.toLowerCase(charRight);
            }
            else {
                right--;
                continue;
            }

            if(lowerLeft != lowerRight) {
                currentStatus = false;
                break;
            }    
            left++;
            right--;
        }

        return currentStatus;

    }
}
