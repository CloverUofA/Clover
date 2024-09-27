package com.example.clover;

public class Hexagon extends Shape {
    private int side;

    public Hexagon() {
        super();
        this.side = 0;
    }

    public Hexagon(int x, int y, int s) {
        super(x, y);
        this.side = s;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
