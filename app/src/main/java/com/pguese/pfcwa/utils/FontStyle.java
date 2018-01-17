package com.pguese.pfcwa.utils;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by Mykel Leano on 18/10/2017.
 */

public class FontStyle {

    public static Typeface centuryGothic(Context ctx) {
//        return Typeface.createFromAsset(ctx.getAssets(), "chalkboard_bold.ttf");
        return Typeface.createFromAsset(ctx.getAssets(), "centurygothic.ttf");
    }
}
