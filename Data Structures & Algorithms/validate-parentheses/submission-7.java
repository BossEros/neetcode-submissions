class Solution {
    public boolean isValid(String s) {
        if(s.length() == 0 || s == null)
            return false;
        
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for(char c : s.toCharArray()){
            if(map.containsValue(c)){
                stack.push(c);
            } else if (map.containsKey(c)){
                if(stack.isEmpty() || stack.pop() != map.get(c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
