package com.adhamenaya.mosaiclayout.model;

/**
 * Created by aenaya on 7/24/2018.
 */

public class SmallContainer extends Container {

    @Override
    public boolean canFit(int current, boolean[] occupy) {
        if (occupy[current] || current >= 8) return false;
        return true;
    }

    @Override
    public void create(int current, boolean[] occupy) {
        occupy[current] = true;
        cells.add(new Cell(current));
    }
    @Override
    public int updateCount(int count) {
        return count += 1;
    }

    @Override
    public int updateCurrent(int current) {
        return current += 1;
    }
}
