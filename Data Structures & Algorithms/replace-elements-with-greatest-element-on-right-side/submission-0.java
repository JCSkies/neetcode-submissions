class Solution {
    public int[] replaceElements(int[] arr) {
    int greatest = -1;
    int currentValue = -1;
        for(int i = arr.length - 1; i >= 0; i--) {
            currentValue = arr[i]; //put the current value as temporary and get the current greatest obtained from the right side.
            arr[i] = greatest;

            if(currentValue > greatest) {
                greatest = currentValue;
            }
            
        }

        return arr;
    }



}