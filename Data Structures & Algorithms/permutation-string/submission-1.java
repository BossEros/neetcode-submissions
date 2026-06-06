class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length())
            return false;

        StringBuilder string = new StringBuilder();
        for(int i = 0; i < s1.length(); i++)
            string.append(s2.charAt(i));
        
        char[] arr = string.toString().toCharArray();
        char[] arr2 = s1.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);

        if(Arrays.equals(arr, arr2))
            return true;
        
        for(int i = s1.length(); i < s2.length(); i++){
            string.deleteCharAt(0);
            string.append(s2.charAt(i));

            arr = string.toString().toCharArray();
            Arrays.sort(arr);
            if(Arrays.equals(arr, arr2))
                return true;
        }
        return false;
    }
}
