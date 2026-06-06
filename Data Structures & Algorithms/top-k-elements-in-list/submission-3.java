class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> elements = new HashMap<>();
        HashMap<Integer, Integer> results = new HashMap<>();
        int[] result = new int[k];

        for(int a : nums)
            elements.put(a, elements.getOrDefault(a, 0) + 1);

        int a = 0;
        while(a < k)
        {
            int max = 0;
            int b = 0;
            for(Map.Entry<Integer, Integer> entry : elements.entrySet())
            {
                if(entry.getValue() > max && !(results.containsKey(entry.getKey())))
                {
                    max = entry.getValue();
                    b = entry.getKey();
                }
            }

            results.put(b, results.getOrDefault(b, 0) + 1);
            result[a] = b;
            a++;            
        }
        return result;
    }
}
