
class Solution {
    private static final char DELIMITER = '\0';

    public String encode(List<String> strs) {
        if(strs.size() == 0 || strs == null)
            return "";
        
        StringBuilder stringBuilder = new StringBuilder();
        for(String s : strs){
            stringBuilder.append(s).append(DELIMITER);
        }

        return stringBuilder.toString();
    }
        

    public List<String> decode(String str) {
        if(str.length() == 0 || str == null)
            return new ArrayList<>();
        
        String[] arr = str.split(Character.toString(DELIMITER), -1);
        if(arr.length > 0 && arr[arr.length - 1].isEmpty()){
            return Arrays.asList(arr).subList(0, arr.length - 1);
        }

        return Arrays.asList(arr);
    }
}
