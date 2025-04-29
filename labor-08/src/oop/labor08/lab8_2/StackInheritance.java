package oop.labor08.lab8_2;

import java.util.ArrayList;

public class StackInheritance extends ArrayList<Object> {
    private final int capacity;

    public StackInheritance(int capacity) {
        super();
        this.capacity = capacity;
    }

    public void push(Object item) {
        if (!isFull()) {
            this.add(item);
        }
    }

    public void pop() {
        if (!isEmpty()) {
            this.remove(this.size() - 1);
        }
    }

    public Object top() {
        if (isEmpty()) return null;
        return this.get(this.size() - 1);
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public boolean isFull() {
        return this.size() == capacity;
    }

}
