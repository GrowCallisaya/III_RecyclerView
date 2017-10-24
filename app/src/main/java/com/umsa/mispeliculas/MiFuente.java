package com.umsa.mispeliculas;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * Created by growcallisaya on 10/24/17.
 */
public class MiFuente extends AppCompatTextView {


    public MiFuente(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MiFuente(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MiFuente(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/Tony.ttf"));
        }
    }
}
