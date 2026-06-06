class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        Stack<State> stack = new Stack<>();
        stack.push(new State("", 0, 0));

        while(!stack.isEmpty()){
            State currentState = stack.pop();

            if(currentState.current.length() == n * 2){
                list.add(currentState.current);
                continue;
            }

            if(currentState.open < n){
                stack.push(new State(currentState.current.concat("("), currentState.open + 1, currentState.close));
            }
            if(currentState.close < currentState.open){
                stack.push(new State(currentState.current.concat(")"), currentState.open, currentState.close + 1));
            }
        }
        return list;
    }

    static class State {
        String current;
        int open;
        int close;

        public State(String current, int open, int close){
            this.current = current;
            this.open = open;
            this.close = close;
        }
    }
    
}


