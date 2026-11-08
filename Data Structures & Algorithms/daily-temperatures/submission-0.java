class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> temps = new Stack<>();
        int result[] = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++) {
            int current = temperatures[i];
            while (!temps.isEmpty() && current > temps.peek()[0]) {
                int[] pair = temps.pop();
                result[pair[1]] = i - pair[1]; //index in result is difference between current and res
            }
            temps.push(new int[]{current, i});
        }   

        return result;
    }
}
