class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sortedWord = new String(c);

            map.putIfAbsent(sortedWord, new ArrayList<>());
            map.get(sortedWord).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
