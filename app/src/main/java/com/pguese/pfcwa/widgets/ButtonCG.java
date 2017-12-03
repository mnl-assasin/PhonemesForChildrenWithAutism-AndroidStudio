package com.pguese.pfcwa.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

import com.pguese.pfcwa.utils.FontStyle;

/**
 * Created by Mykel Leano on 18/10/2017.
 */

@SuppressLint("AppCompatCustomView")
public class ButtonCG extends Button {

    public ButtonCG(Context context) {
        super(context);
        setTypeface(FontStyle.centuryGothic(context));
    }

    public ButtonCG(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(FontStyle.centuryGothic(context));
    }

    public ButtonCG(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(FontStyle.centuryGothic(context));
    }
}
