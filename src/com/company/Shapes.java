package com.company;

public class Shapes {

    private String name;
    private int size;
    private boolean circleOrNot;

    public Shapes(){

    }

    public Shapes(String name, int size, boolean circleOrNot) {
        this.name = name;
        this.size = size;
        this.circleOrNot = circleOrNot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isCircleOrNot() {
        return circleOrNot;
    }

    public void setCircleOrNot(boolean circleOrNot) {
        this.circleOrNot = circleOrNot;
    }

    @Override
    public String toString() {
        return "This shape is named " + name
                + " and it's size is " + size;
    }

    public int sum (int a, int b){
        return a+b;
    }

    public int sum (int a, int b, int c){
        return a+b+c;
    }
}
