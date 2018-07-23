package com.adhamenaya.mosaiclayout.model;

/**
 * Created by aenaya on 7/23/2018.
 */

public class Cell {

    int id;
    int row, column;

    // Top left corner
    int x1, y1;

    // Bottom right corner
    int x2, y2;

    boolean isOccupied = false;

    public Cell(int id) {
        this.id = id;
    }

    public int getHeight() {
        return y2 - y1;
    }

    public int getWidth() {
        return x2 - x1;
    }
}
