class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         if(nums.length == 0)
            return new ArrayList<>();

        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++){
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
                int current = i;
            int low = current + 1;
            int high = nums.length - 1;
            int target = 0 - nums[current];

            while(low < high){
                if(nums[low] + nums[high] == target){
                    list.add(Arrays.asList(nums[current], nums[low], nums[high]));
                    while(low < high && nums[low] == nums[low + 1])low++;
                    while(low < high && nums[high] == nums[high - 1])high--;
                    
                    low++;
                    high--;
                } 
                else if(nums[low] + nums[high] < target)
                    low++;
                else
                    high--;
                }
            }
        }
        return list;
    }
}
