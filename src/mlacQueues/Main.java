/* Main.java
 * CSCI 221 - Fall 2021
 * Last edited Oct. 15, 2021 by M. Lacanilao
 *
 * This class will utilize the Stack class in order to manipulate an array
 * of strings. We will use the Stack to reverse the array we have hardcoded into
 * the main method.
 *
 * We will create our own Stack class as opposed to using the one provided by
 * the Java Collections Framework. Thus, we must manually create the push() method
 * to send the first element of the String array to our stack repeatedly until
 * it is full. Once the stack is full, we will implement a pop() method to send
 * the last element we just sent to the stack back to a new Array of Strings until
 * the stack is empty.
 *
 */

package mlacQueues;

public class Main {

    public static void main(String[] args) {

        String[] cities = {
	        "Philadelphia, PA", "Harrisburg, PA", "Pittsburgh, PA",
            "Cleveland, OH", "Toledo, OH", "Gary, IN", "Chicago, IL"
        };

        int cityCount = cities.length;

        // instantiate Stack object
        Stack stk = new Stack();

        for (int i = 0; i < 7; i++) {
            stk.push(cities[i]); // pushes items in 'cities' array onto stack
        }
        System.out.println ("Route from Philadelphia, PA to Chicago, IL: ");
        for (int i = 0; i < 7; i++) {
            if (i==6) {
                System.out.println (cities[i]);
                break;
            }
            System.out.println (cities[i] + " " + "->" + " ");
        }

        System.out.println ();
        for (int i = 0; i < cities.length; i++) {
            cities[i] = stk.pop (); // pop cities off the stack
        }

        System.out.println ("Route from Chicago, IL to Philadelphia, PA: ");
        for (int i=0; i < 7; i++) {
            if (i == 6) {
                System.out.println (cities[i]);
                break;
            }
            System.out.println (cities[i] + " " + "->" + " ");
        }

        System.out.println ("\n");

        Queue q = new Queue (cityCount);

        // add items to queue
        for (int i = 0; i < cityCount; i++) {
            q.enqueue (cities[i]);
            System.out.println (cities[i] + " being added, queue size = " + q.size ());
        }

        System.out.println ("\n");

        // remove items from queue
        for (int i = 0; i < cityCount; i++) {
            q.dequeue ();
            System.out.println (cities[i] + " removed, queue size = " + q.size ());
        }
    }
}
