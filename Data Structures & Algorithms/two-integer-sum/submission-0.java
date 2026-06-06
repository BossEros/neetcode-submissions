class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int a = 0; a < nums.length; a++)
        {
            int complement = target - nums[a];
            if(map.containsKey(complement))
                return new int[] {map.get(complement), a};

            map.put(nums[a], a);
        }
        return new int[] {0, 0};
    }
}
