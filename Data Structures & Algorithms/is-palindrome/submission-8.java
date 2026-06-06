class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();
        
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c))
                builder.append(Character.toLowerCase(c));
        }

        String newString = builder.toString();
        int left = 0, right = newString.length() - 1;

        while(left <= right){
            if(newString.charAt(left) != newString.charAt(right))
                return false;
            
            left++;
            right--;
        }

        return true;
    }
}
