package StacksandQueues;

/**
 * Created by yangxiao on 9/27/16.
 */
public class Stack {
    Node top;

    Integer pop() {
      if(top != null) {
          Integer item = top.data;
          top = top.next;
          return item;
      }
      return null;
    }

    void push(Integer item) {
        Node temp = new Node(item);
        top.next = top;
        top = temp;
    }

    Integer peek() {
        return top.data;
    }
}
