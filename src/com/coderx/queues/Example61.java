package com.coderx.queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class Example61 {
    public static void main(String[] args) {
       Queue<String> queue = new ArrayDeque<>();
        queue.add("Shenal");
        queue.add("Pamudu");
        queue.add("Tharindu");
        queue.add("Vajith");
        queue.offer("Pasan"); // adding element to the queue

        //System.out.println(queue);
        //System.out.println(queue.element()); // get the head element from the queue, if queue is empty - nosuchelement exception wll be thrown
        //System.out.println(queue.remove()); // remove the head element from the queue, if queue is empty - nosuchelement exception wll be thrown
        //System.out.println(queue);
       // System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.peek()); // get the head of element from the queue - if queue is empty null will return
        System.out.println(queue);
        System.out.println(queue.poll()); // removing head from the queue - if queue is empty null will return
        System.out.println(queue);



    }
}
