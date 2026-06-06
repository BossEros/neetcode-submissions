class Solution {
    private static final char delimiter = '\0';

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();

        for(String word : strs){
            builder.append(word).append(delimiter);
        }

        return builder.toString();
    }

    public List<String> decode(String str) {
        String[] words = str.split(Character.toString(delimiter), -1);

        if(words.length > 0 && words[words.length - 1].isEmpty()){
            return Arrays.asList(words).subList(0, words.length - 1);
        }

        return Arrays.asList(words);
    }
}
