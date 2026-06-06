class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String string = new String(arr);

            map.putIfAbsent(string, new ArrayList<>());
            map.get(string).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
}
