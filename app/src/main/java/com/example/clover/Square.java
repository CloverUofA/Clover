package com.example.clover;

public class Square extends Shape {
    private double sideLength;

    public Square(int x, int y, double sideLength){
        super(x,y);
        this.sideLength = sideLength;
    }

    public Square(double sideLength){
        super();
        this.sideLength = sideLength;
    }

    public double getSideLength() {
    return sideLength;
    }

    public void setSideLength(double sideLength) {
    this.sideLength = sideLength;
    }

}
