class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> number = new HashMap<>();

        for(int num : nums)
            number.put(num, number.getOrDefault(num, 0) + 1);

        for(Map.Entry<Integer, Integer> entry : number.entrySet())
        {
            if(entry.getValue() >= 2)
                return true;
        }

        return false;
    }
}
