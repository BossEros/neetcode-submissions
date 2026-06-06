
class Solution {
    private static final char DELIMITER = '\0';

    public String encode(List<String> strs) {
        StringBuilder newString = new StringBuilder();
        for(String s : strs){
            newString.append(s).append(Character.toString(DELIMITER));
        }
        return newString.toString();
    }
        
    public List<String> decode(String str) {
       String[] words = str.split(Character.toString(DELIMITER), - 1);

       if(words.length > 0 && words[words.length - 1].isEmpty()){
          return Arrays.asList(words).subList(0, words.length - 1);
       }
       return Arrays.asList(words);
    }
}
