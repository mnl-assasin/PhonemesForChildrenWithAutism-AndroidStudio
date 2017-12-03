package com.pguese.pfcwa.widgets;

import com.pguese.pfcwa.R;

import java.util.Random;

/**
 * Created by Mykel Leano on 28/11/2017.
 */

public class ColorHelper {

    public static int[] getRainbowColors() {
        int colors[] = new int[7];
        colors[0] = R.color.colorRed;
        colors[1] = R.color.colorOrange;
        colors[2] = R.color.colorYellow;
        colors[3] = R.color.colorGreen;
        colors[4] = R.color.colorBlue;
        colors[5] = R.color.colorIndigo;
        colors[6] = R.color.colorViolet;
        return colors;
    }

    public static int getRandomColor() {
        return getRainbowColors()[new Random().nextInt(7)];
    }

}
