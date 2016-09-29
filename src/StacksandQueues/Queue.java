package StacksandQueues;


/**
 * Created by yangxiao on 9/27/16.
 */
public class Queue {
    Node first, last;

    void enqueue(Integer item) {
        if(first == null) {
            last = new Node(item);
            first = last;
        } else {
            last.next = new Node(item);
            last = last.next;
        }

    }

    Integer dequeue() {
        if(first != null) {
            Integer item = first.data;
            first = first.next;
            if(first == null) last = null; //empty queue
            return item;
        }
        return null;
    }
}
