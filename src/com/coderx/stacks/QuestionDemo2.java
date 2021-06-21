package com.coderx.stacks;

import java.util.Stack;

public class QuestionDemo2 {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();
        names.push("Shenal"); // 4th element
        names.push("Pamudu"); // 3rd element
        names.push("Tharindu"); // 2nd element
        names.push("Vajith");  // head

//        for(String s : names){
//            System.out.println(s);
//        }

//        for(int i=0; i<names.size(); i++){
//            System.out.println(names.pop());
//        }
        System.out.println(names.size());
    }

}
