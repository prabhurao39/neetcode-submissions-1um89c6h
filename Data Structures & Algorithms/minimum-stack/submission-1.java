class MinStack {

    Stack<Integer> stk ;
    
    Stack<Integer> min ;

    MinStack() {
        stk = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        stk.push(val);
        if (min.isEmpty()) {
            min.push(val);
        } else if (min.peek() >= val) {
            min.push( val);
        }
    }

    public void pop() {
        int n = stk.pop();
        if (min.peek() == n) {
            min.pop();
        }

    }

    public int top() {
        return stk.peek();
    }

    public int getMin() {
        return  min.peek();
    }
}
