package com.company;

import java.sql.SQLOutput;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        House blue = new House();
        House red = new House(3);
        House green = new House(4,3,"flat",true);
//       System.out.println(red.getWindows());
        blue.sum(1,2);

        Shapes shape = new Shapes("whatever",4,true);
//        System.out.println(shape.toString());
//        System.out.println(shape);
//        System.out.println(shape.sum(3,4,5));

//        Calculator calc = new Calculator();
//        System.out.println(calc.sum(1,2));

//        Calculator calc = new Calculator();
//        int a = calc.sum(4,5);
//        System.out.println(a);
//        System.out.println(Calculator.sum(2,3));
//        System.out.println(Calculator.sub(5,3));
//        System.out.println(Calculator.mult(5,3));
//        System.out.println(Calculator.div(10,2));
//        System.out.println(Calculator.pi);


        int a = 10;

//        while (a >= 5){
//            System.out.println("hi");
//            a = a - 1;
//        }

//        do{
//            System.out.println("hi");
//            a -= 5;
//            a = a - 5

//            a += 5;
//            a = a + 5

//            a--;
//            a = a - 1

//            a++;
//            a = a + 1
//        } while(a == 10);

//        for (int i = 5; i > 0 ; i--) {
//            System.out.println(i);
//        }
//        int[] arr = {1,1,1,1,1,1,1,1};
//        System.out.println(Calculator.sum(arr));
//        System.out.println(Calculator.sub(15,arr));

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};

    }
}
