package com.coderx.queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class QuestionDemo {
    public static void main(String[] args) {
        Queue<String> names = new ArrayDeque<>();
        names.offer("Shenal");
        names.offer("Pamudu");
        names.offer("Tharindu");
        names.offer("Vajith");

//        System.out.println("Before reversing "+names);
//        System.out.println(reversed(names));
//        System.out.println("After reversing "+ names); // after reversing queue is empty


//        System.out.println("original queue before reversing "+names);
//        System.out.println("reversed "+reversed(names));
//        System.out.println("original queue after reversing "+ names); // after reversing queue as same as original


//        System.out.println("Original queue "+names);
//        reversed(names);
//        System.out.println("After reversing queue "+names);

//        System.out.println("Original queue before getting second element"+names);
//        System.out.println("Second element "+secondElement(names));
//        System.out.println("Original queue after getting second element "+names);

//        System.out.println("Original queue before getting last element"+names);
//        System.out.println("last element "+lastElement(names));
//        System.out.println("Original queue after getting last element "+names);


//        System.out.println("Original queue before removing last element"+names);
//        removeLastElement(names);
//        System.out.println("Original queue after removing last element "+names);

        Queue<String> queue1 = new ArrayDeque<>();
        queue1.add("Shenal");
        queue1.add("Pamudu");
        queue1.add("Tharindu");
        queue1.add("Vajith");

        Queue<String> queue2 = new ArrayDeque<>();
        queue2.add("Oshan");
        queue2.add("Ishara");
        queue2.add("Vishal");

        System.out.println("Queue1 before merge: "+queue1);
        System.out.println("Queue2 before merge: "+queue2);
        System.out.println(merge(queue1, queue2));
        System.out.println("Queue1 after merge: "+queue1);
        System.out.println("Queue2 after merge: "+queue2);


    }

//    private static <E> Queue<E> reversed(Queue<E> queue){
//        // reversed a queue
//        // the problem is original queue is empty after reversing the queue
//        Deque<E> stack = new ArrayDeque<>(); // empty stack
//        Queue<E> queue1 = new ArrayDeque<>(); // empty queue
//
//        while (!queue.isEmpty()){
//            stack.push(queue.poll());
//        }
//
//        while(!stack.isEmpty()){
//            queue1.offer(stack.poll());
//        }
//
//        return queue1;
//
//    }

//    private static <E> Queue<E> reversed(Queue<E> queue){
//        // keep the original queue as it is and reversed the original queue
//        Queue<E> queue1 = new ArrayDeque<>(); // empty queue
//        Deque<E> stack = new ArrayDeque<>(); // empty stack
//
//       // for loop works in queues
//        for(int i=0; i<queue.size(); i++){
//            stack.push(queue.element()); // get the element and add to the stack
//            queue.add(queue.remove()); // remove element and add to the queue again
//        }
//
//        while (!stack.isEmpty()){
//            queue1.add(stack.pop());
//        }
//
//        return queue1;
//    }

//    private static <E> void reversed(Queue<E> queue){
//        // reversed the queue
//        Deque<E> stack = new ArrayDeque<>();
//        while (!queue.isEmpty()){
//            stack.push(queue.remove());
//        }
//
//        while (!stack.isEmpty()){
//            queue.add(stack.pop());
//        }
//    }


    private static <E> E secondElement(Queue<E> queue){
        // returns the second element from the specified queue
        // keeps the original queue as it is
        queue.add(queue.remove()); // remove the head of queue and add it again
        E element = queue.element(); // get the head of element
        for(int i=1; i< queue.size(); i++){
            queue.add(queue.remove());
        }
        return element;
    }

    private static <E> E lastElement(Queue<E> queue){
        // returns the last element
        // keeps the original queue as it is
        for(int i=1; i<queue.size(); i++){
            queue.add(queue.remove());
        }
        E element = queue.element();
        queue.add(queue.remove());

        return element;
    }

    private static <E> void removeLastElement(Queue<E> queue){
        for(int i=1; i< queue.size(); i++){
            queue.add(queue.remove());
        }
        queue.remove(); // remove the last element
    }

    private static <E> Queue<E> merge(Queue<E> queue1, Queue<E> queue2){
        // returns new queue containing same elements from both queue1 and queue2
        // keeps original queue as it is
        Queue<E> queue3 = new ArrayDeque<>();
        int n1 = queue1.size();
        int n2 = queue2.size();

        int n = Math.min(n1, n2);

        for(int i=0; i<n; i++){
            queue3.add(queue1.element());
            queue1.add(queue1.remove());
            queue3.add(queue2.element());
            queue2.add(queue2.remove());
        }

        for(int i=0; i<n1 - n; i++){
            queue3.add(queue1.element());
            queue1.add(queue1.remove());
        }

        for(int i=0; i<n2 - n; i++){
            queue3.add(queue2.element());
            queue2.add(queue2.remove());
        }

        return queue3;
    }
}
