package com.coderx.recursion;

public class RecursionDemo {
    public static void main(String[] args) {
       // System.out.println(factorial(4));
        //System.out.println(f(4));
//        int fib = fibonacci(10);
//        System.out.println(fib);

        for(int n=0; n<=16; n++){
            System.out.println(fibonacci(n));
        }

//        In most cases, recursion is very inefficient because of its frequent function calls. So an iterative
//        implementation may be better if it is not too complex
    }

    // recursive way
    private static int factorial(int n){
        return n == 0 ? 1 : n * factorial(n-1);
    }

    // iterative way
    private static int f(int n){
        int f = 1;
        for(int i=2; i<=n; i++){
            f *= i;
        }
        return f;
    }

    private static int fibonacci(int n){
        if(n < 2){
            return n; // basis
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
