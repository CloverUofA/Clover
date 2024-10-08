package com.example.clover;

public abstract class Shape {
    protected int x;
    protected int y;
    String color = "green";

    public Shape() {
        this.x = 0;
        this.y = 0;
    }

    public Shape(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
