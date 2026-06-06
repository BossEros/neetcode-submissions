
class Solution {
    private static final char DELIMITER = '\0';

    public String encode(List<String> strs) {
        if(strs == null || strs.size() == 0)
            return "";
        
        StringBuilder builder = new StringBuilder();
        for(String s : strs){
            builder.append(s).append(Character.toString(DELIMITER));
        }
        return builder.toString();
    }
        
    public List<String> decode(String str) {
        String[] result = str.split(Character.toString(DELIMITER), - 1);

        if(result.length > 0 && result[result.length - 1] == ""){
            return Arrays.asList(result).subList(0, result.length - 1);
        }
        return Arrays.asList(result);
    }
}
