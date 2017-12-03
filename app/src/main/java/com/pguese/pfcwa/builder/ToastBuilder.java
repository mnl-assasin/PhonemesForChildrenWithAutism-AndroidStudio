package com.pguese.pfcwa.builder;

import android.content.Context;
import android.util.TypedValue;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.pguese.pfcwa.R;

public class ToastBuilder {

    private static final String TAG = ToastBuilder.class.getSimpleName();

    public static void createShortToast(Context ctx, String message) {
        getToast(ctx, message, Toast.LENGTH_SHORT);
    }

    public static void createLongToast(Context ctx, String message) {
        getToast(ctx, message, Toast.LENGTH_LONG);
    }

    public static void getToast(Context ctx, String message, int length) {
        Toast toast = Toast.makeText(ctx, message, length);
        LinearLayout toastLayout = (LinearLayout) toast.getView();
        TextView toastTV = (TextView) toastLayout.getChildAt(0);
        toastTV.setTextSize(TypedValue.COMPLEX_UNIT_PX,
                ctx.getResources().getDimension(R.dimen.textSizeNormal));
        toast.show();
    }
}