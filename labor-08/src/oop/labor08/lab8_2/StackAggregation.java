package oop.labor08.lab8_2;

import java.util.ArrayList;

public class StackAggregation {
    private final ArrayList<Object> items = new ArrayList<>();
    private final int capacity;

    public StackAggregation(int capacity) {
        this.capacity = capacity;
    }

    public void push(Object item) {
        if (!isFull()) {
            items.add(item);
        }
    }

    public void pop() {
        if (!isEmpty()) {
            items.removeLast();
        }
    }

    public Object top() {
        if (isEmpty()) return null;
        return items.getLast();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public boolean isFull() {
        return items.size() == capacity;
    }

    public int getSize() {
        return items.size();
    }
}
