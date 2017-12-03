package com.pguese.pfcwa.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.pguese.pfcwa.R;
import com.pguese.pfcwa.widgets.ColorHelper;
import com.pguese.pfcwa.widgets.TextViewCG;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.pguese.pfcwa.data.Const.alphabet;

/**
 * Created by Mykel Leano on 20/10/2017.
 */

public class AlphabetAdapter extends BaseAdapter {

    private Context ctx;
    private LayoutInflater inflater;

//    private int rainbowColors[];

    public AlphabetAdapter(Context ctx) {
        this.ctx = ctx;
        inflater = LayoutInflater.from(ctx);

//        rainbowColors = ColorHelper.getRainbowColors();
    }

    @Override
    public int getCount() {
        return alphabet.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        final ViewHolder holder;
        if (view != null) {
            holder = (ViewHolder) view.getTag();
        } else {
            view = inflater.inflate(R.layout.item_flashcard, parent, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }

//        holder.textView.setBackgroundResource(rainbowColors[i % 7]);
        holder.textView.setBackgroundResource(ColorHelper.getRandomColor());
        holder.textView.setText(alphabet[i]);

        int screenHeight = ((Activity) ctx).getWindowManager()
                .getDefaultDisplay().getHeight();

        view.setMinimumHeight(screenHeight / 8);
        return view;
    }


    static class ViewHolder {
        @BindView(R.id.textView)
        TextViewCG textView;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
