class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0)
            return 0;
        
        Arrays.sort(nums);
        int index = Arrays.binarySearch(nums, target);

        if(index >= 0)
            return index;
        else
            return -1;
    }
}
