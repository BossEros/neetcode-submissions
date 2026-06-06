class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> stack = new HashSet<>();

        for(int num : nums){
            if(!stack.add(num))
                return true;
        }

        return false;
    }
}