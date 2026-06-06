class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> records = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        int[] result = new int[k];

        for(int num : nums){
            records.put(num, records.getOrDefault(num, 0) + 1);
        }

        for(int i = 0; i < k; i++){
            int mostFrequentElement = 0;
            int maxCount = 0;

            for(Map.Entry<Integer, Integer> entry : records.entrySet()){
                if(entry.getValue() > maxCount && !set.contains(entry.getKey())){
                    mostFrequentElement = entry.getKey();
                    maxCount = entry.getValue();
                }
            }
            
            result[i] = mostFrequentElement;
            set.add(mostFrequentElement);
        }

        return result;
    }
}

