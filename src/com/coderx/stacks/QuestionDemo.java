package com.coderx.stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class QuestionDemo {
    public static void main(String[] args) {
        Deque<String> names = new ArrayDeque<>();
        names.push("Shenal");
        names.push("Pamudu");
        names.push("Vajith");
        names.push("Pasan");
        


//        Deque<String> reversedNames = reversed(names);
//        System.out.println("Original "+names); // after the method run, original one will be remove (empty stack)
//        // we can not use peek, otherwise while loop will never going to stop
//        // the solution is create two stacks in method and re-implement the stack while reversing
//        System.out.println("Reversed "+reversedNames);

//        System.out.println("Original before call reverse method "+names);
//        reversed(names);
//        System.out.println("After calling reverse method "+names);

        //System.out.println(penultimate(names));
//        System.out.println(popPenultimate(names));
//        System.out.println("After removing 2nd element "+names);

        System.out.println(bottom(names));
    }
    // for loop isn't working
    // reversed a deque - (stack)
//    private static <E> Deque<E> reversed(Deque<E> stack){
//        Deque<E> reversedStack = new ArrayDeque<E>();
//        while (!stack.isEmpty()){
//            reversedStack.push(stack.pop());
//        }
//        return reversedStack;
//    }


    // that's what we are doing here
//    private static <E> Deque<E> reversed(Deque<E> stack){
////        // 2 stacks, 1 for re-creating passed stack, the other one for reversing the stack
////        Deque<E> stack1 = new ArrayDeque<>();
////        Deque<E> stack2 = new ArrayDeque<>();
////
////        while (!stack.isEmpty()){
////            stack1.push(stack.peek()); // reversing stack - here we are not removing element, otherwise we cannot
////                                        // reversed to stack 2
////            stack2.push(stack.pop()); // reversing stack - here removing, we do not have to reversed it again
////        }
////
////        while (!stack2.isEmpty()){
////            stack.push(stack2.pop()); // again reversing stack2 therefore stack become not reversed
////        }
////
////        return stack1;
////
////    }


    // stack reversed but not return
    private static <E> void reversed(Deque<E> stack){
        Deque<E> stack1 = new ArrayDeque<>();
        Deque<E> stack2 = new ArrayDeque<>();

        // adding elements to stack1 from stack - (elements in stack will be reversed)
        while (!stack.isEmpty()){
            stack1.push(stack.pop());
        }

        // adding elements from stack1 to stack2 - (elements in stack1 will be reversed - as same as stack)
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        // adding elements to stack from stack2 - (elements in the stack will be reversed)
        while (!stack2.isEmpty()){
            stack.push(stack2.pop());
        }

    }

    private static <E> E penultimate(Deque<E> stack){
        // return the second number from stack
        E x1 = stack.pop();
        E x2 = stack.peek();
        stack.push(x1);

        return x2;
    }

    private static <E> E popPenultimate(Deque<E> stack){
        // remove and return the second number
        E x1 = stack.pop();
        E x2 = stack.pop();
        stack.push(x1);

        return x2;
    }

    private static <E> E bottom(Deque<E> stack){
        Deque<E> stack1 = new ArrayDeque<>();

        // reversing the stack
        while (!stack.isEmpty()){
            stack1.push(stack.pop());
        }

        E x = stack1.peek(); // get the first element from stack1 - ( stack is reversed in stack1) stack last == stack first

        // setting back stack as it is (stack1 reversed back into stack)
        while (!stack1.isEmpty()){
            stack.push(stack1.pop());
        }

        return x;
    }

    private static <E> E popBottom(Deque<E> stack){
        Deque<E> stack1 = new ArrayDeque<>();

        while (!stack.isEmpty()){
            stack1.push(stack.pop());
        }

        E x = stack1.pop();

        while (!stack1.isEmpty()){
            stack.push(stack1.pop());
        }

        return x;
    }
 }
