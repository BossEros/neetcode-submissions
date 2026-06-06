class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0)
            return new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String word = new String(charArray);

            if(!map.containsKey(word))
                map.put(word, new ArrayList<>());
            
            map.get(word).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
