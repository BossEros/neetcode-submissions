
class Solution {
    private static final char DELIMITER = '\0';

    public String encode(List<String> strs) {
        if(strs.size() == 0 || strs == null){
            return "";
        }

        StringBuilder builder = new StringBuilder();
        for(String s : strs){
            builder.append(s).append(DELIMITER);
        }

        return builder.toString();
    }
        

    public List<String> decode(String str) {
        if(str.isEmpty() || str.length() == 0)
            return new ArrayList<>();

        String[] split = str.split(Character.toString(DELIMITER), -1);
        if(split.length > 0 && split[split.length - 1].isEmpty()){
            return Arrays.asList(split).subList(0, split.length - 1);
        }

        return Arrays.asList(split);
    }
}
