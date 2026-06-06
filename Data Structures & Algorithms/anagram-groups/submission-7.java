class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            int[] arr = new int[26];
            for(char ch : s.toCharArray()){
                arr[ch - 'a']++;
            }
            String sorted = Arrays.toString(arr);

            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
