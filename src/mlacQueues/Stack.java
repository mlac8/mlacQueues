/* Stack.java
 * CSCI 211 - Fall 2021
 * Last edited Oct. 15, 2021 by M. Lacanilao
 *
 * As previously stated, we are manually creating a Stack class with the push(),
 * pop(), and isEmpty() methods as opposed to utilizing the default Stack class
 * that the Java Collections Framework provides us.
 *
 * A Queue class will be created to add the peek(), enqueue(), and dequeue()
 * methods.
 */

package mlacQueues;

public class Stack {
    public static final int size = 100;
    int top;
    String[] arr = new String[size]; // stack class
    String places;

    public Stack() {
        this.top = -1; // sets top of stack to -1
    }

    public boolean push(String places) {
        // only processed if stack is not full
        if (top >= (size - 1)) {
            System.out.println ("STACK OVERFLOW!");
            return false;
        } else {
            arr[++top] = places;
            return true;
        }
    } // end push()

    public String pop() {
        // only processed if stack is not empty
        if (top < 0) {
            return "STACK UNDERFLOW!";
        } else {
            String placesPopped = arr[top--];
            return placesPopped;
        }
    } // end pop()
}
