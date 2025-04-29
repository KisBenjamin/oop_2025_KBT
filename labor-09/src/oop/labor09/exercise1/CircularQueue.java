package oop.labor09.exercise1;

public class CircularQueue implements IQueue {
    private int CAPACITY;
    private Object[] items;
    private int front;
    private int rear;

    public CircularQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        this.items = new Object[CAPACITY+1];
        this.front = 0;
        this.rear = 0;
    }

    @Override
    public boolean isEmpty() {
        return front == rear;
    }

    @Override
    public boolean isFull() {
        return (rear + 1) % items.length == front;
    }

    @Override
    public void enQueue(Object o) {
        if (isFull()) {
            System.out.println("QUEUE FULL!");
            return;
        }
        items[rear] = o;
        rear = (rear + 1) % items.length;
    }

    @Override
    public Object deQueue() {
        if (isEmpty()) {
            System.out.println("QUEUE EMPTY!");
            return null;
        }
        Object item = items[front];
        items[front] = null; // optional
        front = (front + 1) % items.length;
        return item;
    }

    @Override
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        int i = front;
        while (i != rear) {
            System.out.print(items[i] + " ");
            i = (i + 1) % items.length;
        }
        System.out.println();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;

        CircularQueue other = (CircularQueue) obj;

        if (this.CAPACITY != other.CAPACITY) return false;

        int thisSize = (this.rear - this.front + items.length) % items.length;
        int otherSize = (other.rear - other.front + other.items.length) % other.items.length;

        if (thisSize != otherSize) return false;

        for (int i = 0; i < thisSize; ++i) {
            Object a = this.items[(this.front + i) % items.length];
            Object b = other.items[(other.front + i) % other.items.length];
            if (a == null || b == null || !a.equals(b)) return false;
        }

        return true;
    }
}
