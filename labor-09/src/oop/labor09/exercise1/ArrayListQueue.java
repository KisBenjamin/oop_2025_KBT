package oop.labor09.exercise1;

import java.util.ArrayList;

public class ArrayListQueue implements IQueue {
    private int CAPACITY;
    private ArrayList<Object> items = new ArrayList<>();


    public ArrayListQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public boolean isFull() {
        return items.size() == CAPACITY;
    }

    public void enQueue(Object o) {
        if (isFull()) {
            System.out.println("QUEUE FULL!!!");
            return;
        }
        items.add(o);
    }

    public Object deQueue() {
        if (isEmpty()) {
            System.out.println("QUEUE EMPTY!!!");
            return null;
        }
        return items.remove(0);
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("QUEUE IS EMPTY!!");
            return;
        }
        System.out.print("QUEUE: ");
        for (Object item : items) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;

        ArrayListQueue other = (ArrayListQueue) obj;

        int thisSize = this.items.size();
        int otherSize = other.items.size();

        if (thisSize != otherSize) return false;

        for (int i = 0; i < thisSize; ++i) {
            if (!this.items.get(i).equals(other.items.get(i))) {
                return false;
            }
        }

        return true;
    }
}
