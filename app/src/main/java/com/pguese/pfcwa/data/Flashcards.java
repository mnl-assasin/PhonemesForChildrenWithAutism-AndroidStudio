package com.pguese.pfcwa.data;

import com.pguese.pfcwa.R;
import com.pguese.pfcwa.model.FlashcardItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BCS MANILA on 19/12/2017.
 */

public class Flashcards {

    public static List<FlashcardItem> getAll(){
        List<FlashcardItem> items = new ArrayList<>();
        items.add(new FlashcardItem(0, "Apple", R.drawable.fc_apple, R.raw.apple));
        items.add(new FlashcardItem(0, "Arrow", R.drawable.fc_apple, R.raw.arrow));
        items.add(new FlashcardItem(0, "Ant", R.drawable.fc_apple, R.raw.sample));
        items.add(new FlashcardItem(1, "Ball", R.drawable.fc_apple, R.raw.sample));
        items.add(new FlashcardItem(1, "Bell", R.drawable.fc_apple, R.raw.sample));
        items.add(new FlashcardItem(1, "Basket", R.drawable.fc_apple, R.raw.sample));
        return items;
    }

    public static List<FlashcardItem> getFlashcard(int id){
        List<FlashcardItem> tempItems = getAll();
        List<FlashcardItem> items = new ArrayList<>();

        for(int i = 0; i < tempItems.size(); i++)
            if(tempItems.get(i).getIndex() == id)
                items.add(tempItems.get(i));

        return items;
    }

    public static int getPlaybackLetter(int index){
        return R.raw.apple;
    }
}
