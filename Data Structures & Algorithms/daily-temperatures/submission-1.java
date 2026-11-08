class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stack = new Stack<>();
        int[] result = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++) {
            int current = temperatures[i];

            while(!stack.isEmpty() && current > stack.peek()[0]) {
                int[] pair = stack.pop();
                result[pair[1]] = i - pair[1];
            }

            stack.push(new int[]{current, i});
            //array value pair is {temp, index}

        }

        return result;
    }
}
