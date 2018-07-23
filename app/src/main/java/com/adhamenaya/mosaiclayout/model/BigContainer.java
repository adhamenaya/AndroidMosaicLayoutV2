package com.adhamenaya.mosaiclayout.model;

/**
 * Created by aenaya on 7/24/2018.
 */

public class BigContainer extends Container {

    @Override
    public boolean canFit(int current, boolean[] occupy) {
        if (occupy[current] || current >= 8) return false;
        if (occupy[current + 1] || current >= 8) return false;
        if (occupy[current + 4] || current >= 8) return false;
        if (occupy[current + 5] || current >= 8) return false;
        return true;
    }

    @Override
    public void create(int current, boolean[] occupy) {
        occupy[current] = true;
        occupy[current + 1] = true;
        occupy[current + 4] = true;
        occupy[current + 5] = true;

        cells.add(new Cell(current));
        cells.add(new Cell(current + 1));
        cells.add(new Cell(current + 4));
        cells.add(new Cell(current + 5));

    }

    @Override
    public int updateCount(int count) {
        return count += 4;
    }

    @Override
    public int updateCurrent(int current) {
        return current += 2;
    }
}
