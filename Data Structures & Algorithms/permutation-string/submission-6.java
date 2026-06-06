class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length())
            return false;
        
        int[] countA = new int[26];
        int[] countB = new int[26];

        for(int i = 0; i < s1.length(); i++)
            countA[s1.charAt(i) - 'a']++;
        
        for(int j = 0; j < s1.length(); j++)
            countB[s2.charAt(j) - 'a']++;

        if(Arrays.equals(countA, countB))
            return true;
        
        for(int i = s1.length(); i < s2.length(); i++){
            countB[s2.charAt(i) - 'a']++;
            countB[s2.charAt(i - s1.length()) - 'a']--;

            if(Arrays.equals(countA, countB)){
                return true;
            }
        }
        
        return false;
    }
}
