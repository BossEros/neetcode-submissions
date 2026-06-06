class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];

        int left = 1;
        for(int a = 0; a < length; a++){
            if(a > 0)
                left *= nums[a-1];
            
            result[a] = left;
        }

        int right = 1;
        for(int j = length - 1; j >= 0; j--){
            if(j < length - 1)
                right *= nums[j+1];
            
            result[j] *= right;
        }

        return result;
    }
}  
