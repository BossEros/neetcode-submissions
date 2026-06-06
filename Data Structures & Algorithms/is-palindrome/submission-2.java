class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c))
                newStr.append(Character.toLowerCase(c));
        }

        String word = newStr.toString();
        int i = 0, j = word.length() - 1;

        while(i <= j){
            if(word.charAt(i) != word.charAt(j))
                return false;
            
            i++;
            j--;
        }

        return true;
    }
}
