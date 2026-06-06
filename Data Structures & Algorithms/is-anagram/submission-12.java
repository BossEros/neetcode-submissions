class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        char[] string1 = s.toCharArray();
        char[] string2 = t.toCharArray();
        Arrays.sort(string1);
        Arrays.sort(string2);
        String word1 = new String(string1);
        String word2 = new String(string2);

        for(int i = 0; i < s.length(); i++){
            if(word1.charAt(i) != word2.charAt(i))
                return false;
        }

        return true;
    }
}
