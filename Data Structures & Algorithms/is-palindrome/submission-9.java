class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c))
                builder.append(Character.toLowerCase(c));
        }

        String word = builder.toString();
        int left = 0, right = word.length() - 1;

        while(left <= right){
            if(word.charAt(left) != word.charAt(right))
                return false;
            
            left++;
            right--;
        }

        return true;
    }
}
