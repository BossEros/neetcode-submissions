
class Solution {
    public static final char DELIMITER = '\0';

    public String encode(List<String> strs) {
        StringBuilder string = new StringBuilder();

        for(String s : strs)
            string.append(s).append(DELIMITER);
        
        return string.toString();
    }
        
    public List<String> decode(String str) {
        String[] words = str.split(Character.toString(DELIMITER), -1);

        if(words.length > 0 && words[words.length - 1].isEmpty()){
            return Arrays.asList(words).subList(0, words.length - 1);
        }

        return Arrays.asList(words);
    }
}
