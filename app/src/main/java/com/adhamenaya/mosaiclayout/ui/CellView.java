package com.adhamenaya.mosaiclayout.ui;

import android.content.Context;
import android.widget.LinearLayout;

/**
 * Created by aenaya on 7/23/2018.
 */

public class CellView extends LinearLayout {

    public CellView(Context context){
        super(context);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(widthMeasureSpec,heightMeasureSpec);
    }
}


