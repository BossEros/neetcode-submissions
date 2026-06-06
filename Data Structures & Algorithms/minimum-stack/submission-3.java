class MinStack {
    Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
        }
 
        stack.pop();      
    }
    
    public int top() {
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }

        return stack.peek();
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int num : stack)
            min = Math.min(min, num);
        
        return min;
    }
}
