class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0)
            return false;

        String cleanString = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleanString.length() - 1;

        while(left < right)
        {
            if(cleanString.charAt(left) != cleanString.charAt(right))
                return false;

            left++;
            right--;
        }
        return true;    
    }
}
