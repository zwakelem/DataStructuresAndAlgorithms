package za.co.simplitate.queue;

import za.co.simplitate.util.Employee;

import java.util.NoSuchElementException;

public class ArrayQueue {

    private Employee[] queue;

    private int front; // front of the queue, might not be index 0 in backing array

    private int back; // points to next available slot on the queue

    public ArrayQueue(int capacity) {
        this.queue = new Employee[capacity];
    }

    public void add(Employee employee) {
        if(back == queue.length) { // check if queue is full
            Employee[] newArray = new Employee[2 * queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }
        queue[back] = employee;
        back++;
    }

    public Employee remove() {
        if(size() == 0) {
            throw new NoSuchElementException();
        }

        Employee removedEmployee = queue[front];
        queue[front] = null;
        front++;
        if(size() == 0) { // optimisation
            front = 0;
            back = 0;
        }
        return removedEmployee;
    }

    public Employee peek() {
        if(size() == 0) {
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    public int size() {
        return back - front;
    }

    public void printQueue() {
        for(int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }
}
