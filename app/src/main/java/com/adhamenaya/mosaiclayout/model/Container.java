package com.adhamenaya.mosaiclayout.model;

import com.adhamenaya.mosaiclayout.model.Cell;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aenaya on 7/23/2018.
 */

public abstract class Container {

    int id;

    public List<Cell> cells;

    public Container() {
        cells = new ArrayList<Cell>();
    }

    public double getVerticalShift() {

        return -1;
    }

    public abstract boolean canFit(int current, boolean[] occupy);

    public abstract void create(int current, boolean[] occupy);

    public abstract int updateCount(int count);

    public abstract int updateCurrent(int current);
}
