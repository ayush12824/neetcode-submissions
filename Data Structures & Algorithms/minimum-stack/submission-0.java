class MinStack {
    Stack<Integer> main;
    Stack<Integer> min;

    public MinStack() {
        main=new Stack<>();
        min=new Stack<>();
    }
    
    public void push(int val) {
        main.push(val);
        if(min.isEmpty()){
            min.push(val);
        }else{
           min.push(Math.min(val,min.peek()));
        }
    }
    
    public void pop() {
        main.pop();
        min.pop();
    }
    
    public int top() {
        int num=main.peek();
        return num;
    }
    
    public int getMin() {
        int num=min.peek();
        return num;
    }
}
