class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1;
        int maxArea = 0;

        while(left < right){
            int length = Math.min(heights[left], heights[right]);
            int width = right - left;
            int currentArea = length * width;

            maxArea = Math.max(currentArea, maxArea);

            while(left < right && heights[left] <= length)
                left++;
            while(left < right && heights[right] <= length)
                right--;
        }
        return maxArea;
    }
}
