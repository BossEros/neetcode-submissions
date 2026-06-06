class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left = 1;
        int length = nums.length;
        int[] result = new int[length];

        for(int i = 0; i < length; i++)
        {
            if(i > 0)
            {
                left *= nums[i-1];
            }

            result[i] = left;
        }

        int right = 1;

        for(int j = length - 1; j >= 0; j--)
        {
            if(j < length - 1)
            {
                right *= nums[j + 1];
            }
            result[j] *= right;

        }

        return result;
    }
}  
