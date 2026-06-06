class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length == 0 || tokens == null)
            return 0;

        Stack<Integer> stack = new Stack<>();
        
        for(String s : tokens){
            switch(s){
                case "+":
                    if(!stack.isEmpty()){
                        int num2 = stack.pop();
                        int num1 = stack.pop();
                        int sum = num1 + num2;
                        stack.push(sum); 
                    }
                    break;
                
                case "-":
                    if(!stack.isEmpty()){
                        int num2 = stack.pop();
                        int num1 = stack.pop();
                        int difference = num1 - num2;
                        stack.push(difference); 
                    }
                    break;
                
                case "*":
                    if(!stack.isEmpty()){
                        int num2 = stack.pop();
                        int num1 = stack.pop();
                        int product = num1 * num2;
                        stack.push(product); 
                    }
                    break;
                
                case "/":
                    if(!stack.isEmpty()){
                        int num2 = stack.pop();
                        int num1 = stack.pop();
                        int quotient = num1 / num2;
                        stack.push(quotient); 
                    }
                    break;
                
                default:
                    stack.push(Integer.parseInt(s));
            }
        }

        return stack.pop();
    }
}
