package com.pguese.pfcwa.utils;

import android.util.Log;

import java.util.List;

/**
 * Created by Neds Leano on 22/12/2017.
 */

public class Util {


    public static boolean isExist(List<Integer> list, int x) {
        for (int i = 0; i < list.size(); i++)
            if (list.get(i) == x)
                return true;

        return false;
    }

    public static void listQuestions(String TAG, List<Integer> list) {

        for (int i : list) {
            Log.d(TAG, "List of question: " + i);
        }

    }

}
