package StacksandQueues;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by yangxiao on 9/27/16.
 */
public class Node {
    int data;
    Node next = null;

    public Node(int d) {
        data = d;
    }

    void appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while(n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    public void display() {
        Node head = this;
        while(head!= null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
}

class Solution {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("input.txt"));

        int n = in.nextInt();
        while(n!=-1) {
          Node head = null;

          while(n--!=0) {
              Node temp = new Node(in.nextInt());
              if(head == null) head = temp;
              else head.appendToTail(temp.data);
          }
            head.display();
            n = in.nextInt();
        }


        in.close();
    }
}
