class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        Stack<State> stack = new Stack<>();
        stack.push(new State("", 0, 0));

        while(!stack.isEmpty()){
            State state = stack.pop();

            if(state.current.length() == n * 2){
                list.add(state.current);
                continue;
            }

            if(state.open < n){
                stack.push(new State(state.current.concat("("), state.open + 1, state.close));
            }
            if(state.close < state.open){
                stack.push(new State(state.current.concat(")"), state.open, state.close + 1));
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


