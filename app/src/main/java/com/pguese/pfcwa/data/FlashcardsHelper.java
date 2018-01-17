package com.pguese.pfcwa.data;

import com.pguese.pfcwa.R;
import com.pguese.pfcwa.model.FlashcardItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mykel Neds on 19/12/2017.
 */

public class FlashcardsHelper {

    public static List<FlashcardItem> flashcards = null;

    public static List<FlashcardItem> getFlashcards() {
        if (flashcards == null)
            flashcards = getAll();
        return flashcards;
    }

    public static List<FlashcardItem> getFlashcards(int id) {
        List<FlashcardItem> tempItems = getFlashcards();
        List<FlashcardItem> items = new ArrayList<>();

        for (int i = 0; i < tempItems.size(); i++)
            if (tempItems.get(i).getIndex() == id)
                items.add(tempItems.get(i));

        return items;
    }

    private static List<FlashcardItem> getAll() {
        List<FlashcardItem> items = new ArrayList<>();
        items.add(new FlashcardItem(0, "Apple", R.drawable.fc_apple, R.raw.sample));
        items.add(new FlashcardItem(0, "Ant", R.drawable.img_no_resource, R.raw.sample));
        items.add(new FlashcardItem(0, "Arrow", R.drawable.fc_arrow, R.raw.sample));

        items.add(new FlashcardItem(1, "Ball", R.drawable.fc_ball, R.raw.sample));
        items.add(new FlashcardItem(1, "Bell", R.drawable.img_no_resource, R.raw.sample));
        items.add(new FlashcardItem(1, "Basket", R.drawable.img_no_resource, R.raw.sample));

        items.add(new FlashcardItem(2, "Candle", R.drawable.fc_candle, R.raw.sample));
        items.add(new FlashcardItem(2, "Cup", R.drawable.img_no_resource, R.raw.sample));
        items.add(new FlashcardItem(2, "Comb", R.drawable.fc_comb, R.raw.sample));

        items.add(new FlashcardItem(3, "Dog", R.drawable.fc_dog, R.raw.sample));
        items.add(new FlashcardItem(3, "Doll", R.drawable.img_no_resource, R.raw.sample));
        items.add(new FlashcardItem(3, "Door", R.drawable.img_no_resource, R.raw.sample));

        items.add(new FlashcardItem(4, "Egg", R.drawable.fc_egg, R.raw.sample));
        items.add(new FlashcardItem(4, "Envelope", R.drawable.fc_envelope, R.raw.sample));
        items.add(new FlashcardItem(4, "Eggplant", R.drawable.img_no_resource, R.raw.sample));

        items.add(new FlashcardItem(5, "Fish", R.drawable.fc_fish, R.raw.sample));
        items.add(new FlashcardItem(5, "Flag", R.drawable.img_no_resource, R.raw.sample));
        items.add(new FlashcardItem(5, "Flower", R.drawable.img_no_resource, R.raw.sample));

        items.add(new FlashcardItem(6, "Gate", R.drawable.img_no_resource, R.raw.sample));
        items.add(new FlashcardItem(6, "Guitar", R.drawable.fc_guitar, R.raw.sample));
        items.add(new FlashcardItem(6, "Grapes", R.drawable.img_no_resource, R.raw.sample));

        items.add(new FlashcardItem(7, "Hammer", R.drawable.fc_hammer, R.raw.sample));
        items.add(new FlashcardItem(7, "Helmet", R.drawable.fc_helmet, R.raw.sample));
        items.add(new FlashcardItem(7, "Hat", R.drawable.fc_hat, R.raw.sample));

        items.add(new FlashcardItem(8, "Ice cream", R.drawable.fc_icecream, R.raw.sample));
        items.add(new FlashcardItem(8, "Ink", R.drawable.img_no_resource, R.raw.sample));
        items.add(new FlashcardItem(8, "Iron", R.drawable.fc_iron, R.raw.sample));

        items.add(new FlashcardItem(9, "Jeepney", R.drawable.fc_jeepney, R.raw.sample));
        items.add(new FlashcardItem(9, "Jelly", R.drawable.fc_jelly, R.raw.sample));
        items.add(new FlashcardItem(9, "Jar", R.drawable.img_no_resource, R.raw.sample));

        items.add(new FlashcardItem(10, "Key", R.drawable.fc_key, R.raw.sample));
        items.add(new FlashcardItem(10, "Kettle", R.drawable.fc_kettle, R.raw.sample));
        items.add(new FlashcardItem(10, "Kite", R.drawable.fc_kite, R.raw.sample));

        items.add(new FlashcardItem(11, "Lamp", R.drawable.img_no_resource, R.raw.sample));
        items.add(new FlashcardItem(11, "Lemon", R.drawable.img_no_resource, R.raw.sample));
        items.add(new FlashcardItem(11, "Lock", R.drawable.fc_lock, R.raw.sample));

        items.add(new FlashcardItem(12, "Money", R.drawable.fc_money, R.raw.sample));
        items.add(new FlashcardItem(12, "Map", R.drawable.img_no_resource, R.raw.sample));
        items.add(new FlashcardItem(12, "Mango", R.drawable.img_no_resource, R.raw.sample));

        items.add(new FlashcardItem(13, "Nail", R.drawable.fc_nails, R.raw.sample));
        items.add(new FlashcardItem(13, "Net", R.drawable.img_no_resource, R.raw.sample));
        items.add(new FlashcardItem(13, "Nest", R.drawable.img_no_resource, R.raw.sample));

        items.add(new FlashcardItem(14, "Orange", R.drawable.img_no_resource, R.raw.sample));
        items.add(new FlashcardItem(14, "Oven", R.drawable.img_no_resource, R.raw.sample));
        items.add(new FlashcardItem(14, "Onion", R.drawable.img_no_resource, R.raw.sample));

        items.add(new FlashcardItem(15, "Pail", R.drawable.fc_pail, R.raw.sample));
        items.add(new FlashcardItem(15, "Pen", R.drawable.fc_pen, R.raw.sample));
        items.add(new FlashcardItem(15, "Pineapple", R.drawable.fc_pineapple, R.raw.sample));

        items.add(new FlashcardItem(16, "Quilt", R.drawable.img_no_resource, R.raw.sample));
        items.add(new FlashcardItem(16, "Quail egg", R.drawable.fc_quail, R.raw.sample));
        items.add(new FlashcardItem(16, "Queen", R.drawable.img_no_resource, R.raw.sample));

        items.add(new FlashcardItem(17, "Rooster", R.drawable.img_no_resource, R.raw.sample));
        items.add(new FlashcardItem(17, "Radio", R.drawable.fc_radio, R.raw.sample));
        items.add(new FlashcardItem(17, "Ring", R.drawable.fc_ring, R.raw.sample));

        items.add(new FlashcardItem(18, "Switch", R.drawable.fc_switch, R.raw.sample));
        items.add(new FlashcardItem(18, "Shoes", R.drawable.img_no_resource, R.raw.sample));
        items.add(new FlashcardItem(18, "Strawberry", R.drawable.fc_strawberry, R.raw.sample));

        items.add(new FlashcardItem(19, "Table", R.drawable.img_no_resource, R.raw.sample));
        items.add(new FlashcardItem(19, "Tree", R.drawable.fc_tree, R.raw.sample));
        items.add(new FlashcardItem(19, "Tomato", R.drawable.img_no_resource, R.raw.sample));

        items.add(new FlashcardItem(20, "Umbrella", R.drawable.img_no_resource, R.raw.sample));
        items.add(new FlashcardItem(20, "Uniform", R.drawable.fc_uniform, R.raw.sample));
        items.add(new FlashcardItem(20, "Up", R.drawable.fc_up, R.raw.sample));

        items.add(new FlashcardItem(21, "Violin", R.drawable.img_no_resource, R.raw.sample));
        items.add(new FlashcardItem(21, "Van", R.drawable.fc_van, R.raw.sample));
        items.add(new FlashcardItem(21, "Vase", R.drawable.img_no_resource, R.raw.sample));

        items.add(new FlashcardItem(22, "Watermelon", R.drawable.img_no_resource, R.raw.sample));
        items.add(new FlashcardItem(22, "Wall", R.drawable.fc_wall, R.raw.sample));
        items.add(new FlashcardItem(22, "Watch", R.drawable.fc_watch, R.raw.sample));

        items.add(new FlashcardItem(23, "Xylophone", R.drawable.fc_xylophone, R.raw.sample));
        items.add(new FlashcardItem(23, "X-ray", R.drawable.fc_xray, R.raw.sample));
        items.add(new FlashcardItem(23, "Xerox", R.drawable.fc_xerox, R.raw.sample));

        items.add(new FlashcardItem(24, "Yoyo", R.drawable.fc_yoyo, R.raw.sample));
        items.add(new FlashcardItem(24, "Yarn", R.drawable.img_no_resource, R.raw.sample));
        items.add(new FlashcardItem(24, "Yogurt", R.drawable.fc_yogurt, R.raw.sample));

        items.add(new FlashcardItem(25, "Zipper", R.drawable.fc_zipper, R.raw.sample));
        items.add(new FlashcardItem(25, "Zebra", R.drawable.img_no_resource, R.raw.sample));
        items.add(new FlashcardItem(25, "Zoo", R.drawable.fc_zoo, R.raw.sample));


        return items;
    }

    public static int getPlaybackLetter(int index) {
        return R.raw.sample;
    }


}
