class MinStack {
    Stack<Integer> stack = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        if(stack.size() == 0 || stack == null)
            System.out.println("Stack is empty");
            
        stack.pop();
    }
    
    public int top() {
        if(stack.size() == 0 || stack == null)
            return 0;

        return stack.peek();
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;

        for(int num : stack){
            if(num < min)
                min = num;
        }

        return min;
    }
}
