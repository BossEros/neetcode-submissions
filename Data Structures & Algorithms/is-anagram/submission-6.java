class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        HashMap<Character, Integer> entry = new HashMap<>();

        for(int a = 0; a < s.length(); a++)
        {
            entry.put(s.charAt(a), entry.getOrDefault(s.charAt(a), 0) + 1);
            entry.put(t.charAt(a), entry.getOrDefault(t.charAt(a), 0) - 1);
        }

        for(int values : entry.values())
        {
            if(values != 0)
                return false;
        }

        return true;

        
    } 
}

