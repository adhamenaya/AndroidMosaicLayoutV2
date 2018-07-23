package com.adhamenaya.mosaiclayout;

import android.util.Log;

import com.adhamenaya.mosaiclayout.model.BigContainer;
import com.adhamenaya.mosaiclayout.model.Container;
import com.adhamenaya.mosaiclayout.model.HorizontalContainer;
import com.adhamenaya.mosaiclayout.model.SmallContainer;
import com.adhamenaya.mosaiclayout.model.VerticalContainer;
import com.adhamenaya.mosaiclayout.ui.Pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aenaya on 7/23/2018.
 */

public class PatternHelper {

    Pattern board[] = new Pattern[8];

    public PatternHelper() {
        // Init board
        for (int i = 0; i < 8; i++) {
            board[i] = Pattern.EMPTY;
        }
    }


    public List<Container> generate(List<Pattern> patterns) throws Exception {

        boolean[] occupy = {false, false, false, false, false, false, false, false};

        List<Container> containers = new ArrayList<Container>();

        Exception exception = new Exception("Anti-pattern Error!");

        int count = 0;
        int current = 0;

        for (Pattern pattern : patterns) {
            if (current >= 8 || count > 8) throw exception;

            Container container = getFromPattern(pattern);

            if (container != null) {
                if (container.canFit(current, occupy)) {
                    container.create(current, occupy);
                }
                containers.add(container);
                count = container.updateCount(count);
                current = container.updateCurrent(current);
            }
        }
        return containers;
    }

    private Container getFromPattern(Pattern pattern) {
        switch (pattern) {
            case SMALL:
                return new SmallContainer();
            case BIG:
                return new BigContainer();
            case VERTICAL:
                return new VerticalContainer();
            case HORIZONTAL:
                return new HorizontalContainer();
            case EMPTY:
                return null;
        }

        return null;
    }
}

