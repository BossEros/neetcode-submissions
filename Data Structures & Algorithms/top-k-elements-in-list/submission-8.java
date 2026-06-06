class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[k];

        //
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        //
        for(int i = 0; i < k; i++){
            int mostFrequentNumber = 0;
            int maxCount = 0;

            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                if(entry.getValue() > maxCount){
                    maxCount = entry.getValue();
                    mostFrequentNumber = entry.getKey();
                }
            }

            result[i] = mostFrequentNumber;
            map.remove(mostFrequentNumber);
        }

        return result;
    }
}
