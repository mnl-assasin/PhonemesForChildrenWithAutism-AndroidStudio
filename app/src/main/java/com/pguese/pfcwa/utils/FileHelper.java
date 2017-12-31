package com.pguese.pfcwa.utils;

import android.content.Context;

/**
 * Created by Neds Leano on 21/12/2017.
 */

public class FileHelper {

    public static String getRawPath(Context ctx, int resId){
        return "android.resource://" + ctx.getPackageName() + "/ " + resId;
    }
}
