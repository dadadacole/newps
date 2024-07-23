package ch03.sec04;

import java.util.ArrayDeque;
import java.util.Queue;

public class AccuracyExample2 {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        //enque
        q.add(1);
        q.add(2);
        q.add(3);

        //front, dequeue
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());

        //enqueue

        q.add(4);
        q.add(5);

        //empty

        while(!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}