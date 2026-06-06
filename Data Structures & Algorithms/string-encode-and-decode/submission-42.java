class Solution {
    private final static char delimiter = '\0';

    public String encode(List<String> strs) {
        StringBuilder stringBuilder = new StringBuilder();

        for(String word : strs){
            stringBuilder.append(word).append(delimiter);
        }

        return stringBuilder.toString();
    }

    public List<String> decode(String str) {
        String[] words = str.split(Character.toString(delimiter), -1);

        if(words.length > 0 && words[words.length - 1].isEmpty()){
            return Arrays.asList(words).subList(0, words.length - 1);
        }

        return Arrays.asList(words);
    }
}
