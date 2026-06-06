class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 0)
            return 0;

        int left = 0;
        int right = nums.length - 1;
        int min = Integer.MAX_VALUE;
        while(left <= right){
            min = Math.min(nums[left], min);
            min = Math.min(nums[right], min);
            
            left++;
            right--;
        }
        return min;
    }
}
