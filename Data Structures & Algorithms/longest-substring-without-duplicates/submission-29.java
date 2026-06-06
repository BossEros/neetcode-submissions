class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int longest = 0;

        for(int i = 0; i < s.length(); i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(i - set.size()));
            }
            set.add(s.charAt(i));

            longest = Math.max(longest, set.size());
        }

        return longest;
    }  
}
