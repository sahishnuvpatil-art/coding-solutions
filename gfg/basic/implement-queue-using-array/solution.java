class myQueue {
    int[] arr;
    int front, rear, size, capacity;

    
    myQueue(int n) {
        arr = new int[n];
        capacity = n;
        front = 0;
        rear = -1;
        size = 0;
    }

    
    void enqueue(int x) {
        if (!isFull()) {
            rear = (rear + 1) % capacity;
            arr[rear] = x;
            size++;
        }
     
    }

    int dequeue() {
        if (isEmpty()) return -1;
        int val = arr[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }

    int getFront() {
        if (isEmpty()) return -1;
        return arr[front];
    }

    int getRear() {
        if (isEmpty()) return -1;
        return arr[rear];
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == capacity;
    }
}
