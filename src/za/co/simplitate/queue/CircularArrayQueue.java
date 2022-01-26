package za.co.simplitate.queue;

import za.co.simplitate.util.Employee;

import java.util.NoSuchElementException;

public class CircularArrayQueue {

    private Employee[] queue;

    private int front; // front of the queue, might not be index 0 in backing array

    private int back; // points to next available slot on the queue

    public CircularArrayQueue(int capacity) {
        this.queue = new Employee[capacity];
    }

    public void add(Employee employee) {
        if(size() == queue.length - 1) {
            int numItems = size();
            Employee[] newArray = new Employee[2 * queue.length];

            System.arraycopy(queue, front, newArray, 0, queue.length - front);
            System.arraycopy(queue, 0, newArray, queue.length - front, back);

            queue = newArray;
            front = 0;
            back = numItems;
        }
        queue[back] = employee;
        if(back < queue.length - 1)
            back++;
        else
            back = 0;
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
        } else if(front == queue.length) {
            front = 0;
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
        if (front <= back)
            return back - front;
        return back - front + queue.length;
    }

    public void printQueue() {
        if (front <= back) {
            for(int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        } else {
            for(int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
            for(int i = 0; i < back; i++) {
                System.out.println(queue[i]);
            }
        }
    }
}
