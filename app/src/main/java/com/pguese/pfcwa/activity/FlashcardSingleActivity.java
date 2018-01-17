package com.pguese.pfcwa.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.pguese.pfcwa.R;
import com.pguese.pfcwa.data.BundleKeys;
import com.pguese.pfcwa.data.Const;
import com.pguese.pfcwa.utils.MediaPlayerHelper;
import com.pguese.pfcwa.widgets.TextViewCG;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FlashcardSingleActivity extends BaseActivity {

    @BindView(R.id.ivFlashcard)
    ImageView ivFlashcard;
    @BindView(R.id.tvFlashcard)
    TextViewCG tvFlashcard;
    @BindView(R.id.tvObject)
    TextViewCG tvObject;
    @BindView(R.id.ivHome)
    ImageView ivHome;
    @BindView(R.id.ivBack)
    ImageView ivBack;
    @BindView(R.id.ivSpeak)
    ImageView ivSpeak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashcard_single);
        ButterKnife.bind(this);

        initData();
    }

    private void initData() {

        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            int index = extras.getInt(BundleKeys.KEY_INDEX);
            String name = extras.getString(BundleKeys.KEY_NAME);
            int drawable = extras.getInt(BundleKeys.KEY_DRAWABLE);
            int playback = extras.getInt(BundleKeys.KEY_PLAYBACK);

            tvFlashcard.setText(Const.alphabet[index]);
            tvObject.setText(name);
            Picasso.with(this).load(drawable).error(R.drawable.img_no_resource).into(ivFlashcard);
            MediaPlayerHelper.initMediaPlayer(this, playback);
        }

    }

    @OnClick({R.id.ivHome, R.id.ivBack, R.id.ivSpeak})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ivHome:
                setResult(RESULT_OK);
                super.onBackPressed();
                break;
            case R.id.ivBack:
                super.onBackPressed();
                break;
            case R.id.ivSpeak:
                MediaPlayerHelper.repeat();
                break;
        }
    }
}
