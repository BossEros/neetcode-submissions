class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c))
                stringBuilder.append(Character.toLowerCase(c));
        }

        String arrangeWord = stringBuilder.toString();

        int left = 0, right = arrangeWord.length() - 1;
        while(left < right){
            if(arrangeWord.charAt(left) != arrangeWord.charAt(right))
                return false;
            
            left++;
            right--;
        }       

        return true;
    }
}
