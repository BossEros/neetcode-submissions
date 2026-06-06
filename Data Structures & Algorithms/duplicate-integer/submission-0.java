class Solution {
    public boolean hasDuplicate(int[] nums) {

        for(int a = 0; a < nums.length; a++) {
            int count = 0;
            for(int b = 0; b < nums.length; b++) {
                if(nums[b] == nums[a])
                    count++;
            }
            if(count >= 2)
                return true;
        }
        return false;      
    }
}
