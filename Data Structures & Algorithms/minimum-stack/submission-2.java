class MinStack {
   Stack<Integer> stack = new Stack<>();

    public MinStack() {
        
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
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }

        int min = Integer.MAX_VALUE;
        for(int num : stack){
            min = Math.min(min, num);
        }
        return min;
    }
}
