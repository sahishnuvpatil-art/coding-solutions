class myStack {
    int[] arr;
    int top;
    int capacity;

   
    public myStack(int n) {
        arr = new int[n];
        capacity = n;
        top = -1;
    }

    
    public boolean isEmpty() {
        return top == -1;
    }

   
    public boolean isFull() {
        return top == capacity - 1;
    }

    
    public void push(int x) {
        if (!isFull()) {
            arr[++top] = x;
        }
        
    }

 
    public int pop() {
        if (isEmpty()) return -1;
        return arr[top--];
    }


    public int peek() {
        if (isEmpty()) return -1;
        return arr[top];
    }
}
