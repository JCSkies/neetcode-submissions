class Solution {
    public int maxArea(int[] heights) {
        int greatest = 0;
        int l = 0;
        int r = heights.length - 1;

        while (l < r) {
            int floor = Math.min(heights[l], heights[r]);
            int area = (r - l) * floor;
            if (area > greatest) greatest = area;

            if (heights[l] < heights[r] || heights[l] == heights[r]) l++;
            else r--;
        }

        return greatest;
    }
}
