class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String converted = new String(charArray);

            map.putIfAbsent(converted, new ArrayList<>());
            map.get(converted).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
