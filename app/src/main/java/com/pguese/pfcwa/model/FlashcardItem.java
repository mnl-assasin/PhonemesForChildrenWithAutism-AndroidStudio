package com.pguese.pfcwa.model;

/**
 * Created by Neds Leano on 19/12/2017.
 */

public class FlashcardItem {

    int index;
    String name;
    int drawable;
    int playback;

    public FlashcardItem(int index, String name, int drawable, int playback) {
        this.index = index;
        this.name = name;
        this.drawable = drawable;
        this.playback = playback;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public int getDrawable() {
        return drawable;
    }

    public int getPlayback() {
        return playback;
    }
}
