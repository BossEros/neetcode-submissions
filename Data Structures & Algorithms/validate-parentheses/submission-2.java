class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] string = s.toCharArray();

        if(s.length() == 0 || s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']')
                return false;

        for(char element : string)
        {
            if(element == '(' || element == '{' || element == '[')
                stack.push(element);
            else
            {
                if(!stack.isEmpty())
                {
                    char peek = stack.peek();   
                    switch(element)
                    {
                        case ')':
                            if(peek == '(')
                                stack.pop();
                            else
                                return false;
                            break;

                        case '}':
                            if(peek == '{')
                                stack.pop();
                            else
                                return false;
                            break;

                        case ']':
                            if(peek == '[')
                                stack.pop();
                            else
                                return false;
                            break;
                    }
                }
            }

            System.out.println(element);
        }
        return stack.isEmpty();
    }
}
