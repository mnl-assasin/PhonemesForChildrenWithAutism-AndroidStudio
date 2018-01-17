package com.pguese.pfcwa.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.pguese.pfcwa.R;
import com.pguese.pfcwa.utils.FontStyle;

/**
 * Created by Mykel Leano on 18/10/2017.
 */

@SuppressLint("AppCompatCustomView")
public class TextViewCG extends TextView {

    public TextViewCG(Context context) {
        super(context);
        setTypeface(FontStyle.centuryGothic(context));
        setIncludeFontPadding(false);
        setShadowLayer(0.1f, 1, 1, R.color.white);
    }

    public TextViewCG(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(FontStyle.centuryGothic(context));
        setIncludeFontPadding(false);
        setShadowLayer(0.1f, 1, 1, R.color.white);
    }

    public TextViewCG(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(FontStyle.centuryGothic(context));
        setIncludeFontPadding(false);
        setShadowLayer(0.1f, 1, 1, R.color.white);
    }
}
