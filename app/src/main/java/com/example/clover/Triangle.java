package com.example.clover;

import android.health.connect.datatypes.units.Length;

public class Triangle extends Shape {
    private int length1;
    private int length2;
    private int length3;

    public Triangle(int x, int y, int length1, int length2, int length3){
        super(x, y);
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

}
