class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] output = new int[length];

        int left = 1;
        for(int a = 0; a < length; a++)
        {
            if(a > 0)
            {
                left *= nums[a - 1];
            }

            output[a] = left;
        }

        //System.out.print(Arrays.toString(output));

        int right = 1;
        for(int i = length - 1; i >= 0; i--)
        {
            if(i < length - 1)
            {
                right *= nums[i + 1];
            }

            System.out.println(right);
            output[i] *= right;
        }

        return output;
    }
}  
