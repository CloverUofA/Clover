package com.example.clover;

public class star extends Shape {
    private int numberOfPoints;

    public star() {
        super();
        this.numberOfPoints = 0;
    }

    public star(int x, int y, int numberOfPoints) {
        super();
        this.x = x;
        this.y = y;
        this.numberOfPoints = numberOfPoints;
    }

    public void setNumberOfPoints(int numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }

    public int getNumberOfPoints() {
        return numberOfPoints;
    }
}
