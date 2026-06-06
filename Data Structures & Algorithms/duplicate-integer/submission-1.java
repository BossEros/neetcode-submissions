class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> number = new HashMap<>();

        for(int num : nums)
        {
            if(number.containsKey(num))
            {
                number.replace(num, number.get(num) + 1);
            }
            else
            {
                number.put(num, 1);
            }
        }

        for(int key : number.keySet())
        {
            if(number.get(key) >= 2)
                return true;
        }
        return false;
    }
}
