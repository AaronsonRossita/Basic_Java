package com.company;

public class Calculator {

    public static final Double pi = 3.14;

    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];
            sum += arr[i];
        }
        return sum;
    }

//    public static int[] sum(int[] a, int[] b){
//        int[] sum = {};
//
//        return 0;
//    }

    public static int sub(int a, int b){
        return a-b;
    }

    public static int sub(int a, int[] arr){
        int sub = a;
        for (int i = 0; i < arr.length; i++) {
            sub -= arr[i];
        }
        System.out.println("my a = " + a);
        return sub;
    }

    public static int mult(int a, int b){
        return a*b;
    }

    public static int div(int a, int b){
        return a/b;
    }


}
