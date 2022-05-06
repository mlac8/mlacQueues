/* Queue.java
 * CSCI 211 - Fall 2021
 * last edited Oct. 15, 2021
 *
 * Purpose of this class is to add a Queue instantation along with its methods
 * to the main class. This will allow us to print elements of our array in the same
 * order we added them to our queue. We will also count the number of elements
 * in the queue.
 */
package mlacQueues;

public class Queue {
    private String[] arr; // array of cities
    private int front; // first element of queue
    private int back; // last element of queue
    private int capacity; // max capacity
    private int count; // current size of queue

    // Constructor method
    public Queue(int size) {
        arr = new String[size];
        capacity = size;
        front = 0;
        back = -1;
        count = 0;
    }

    // removes first element from queue
    public void enqueue(String element) {
        // checks for queue overflow
        if (isFull ()) {
            System.out.println ("QUEUE OVERFLOW!");
            System.exit (1);
        }
        back = (back + 1) % capacity;
        arr[back] = element;
        count++;
    }

    // adds element to queue
    public void dequeue() {
        // checks for queue underflow
        if (isEmpty ()) {
            System.out.println ("QUEUE UNDERFLOW!");
            System.exit (1);
        }
        front = (front + 1) % capacity;
        count--;
    }

    // returns current size of queue
    public int size() {
        return count;
    }

    // checks if queue is empty
    public Boolean isEmpty() {
        return (size () == 0);
    }

    // checks if queue is full
    public Boolean isFull() {
        return (size () == capacity);
    }
}
