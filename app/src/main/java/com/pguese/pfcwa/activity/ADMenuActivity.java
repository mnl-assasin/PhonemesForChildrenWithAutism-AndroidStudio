package com.pguese.pfcwa.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.pguese.pfcwa.R;
import com.pguese.pfcwa.data.BundleKeys;
import com.pguese.pfcwa.widgets.ButtonCG;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ADMenuActivity extends BaseActivity {

    @BindView(R.id.btnADAlphabet)
    ButtonCG btnADAlphabet;
    @BindView(R.id.btnADVocabulary)
    ButtonCG btnADVocabulary;
    @BindView(R.id.ivBack)
    ImageView ivBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admenu);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnADAlphabet, R.id.btnADVocabulary, R.id.ivBack})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnADAlphabet:
                startActivity(new Intent(this, ADAlphabetActivity.class));
                break;
            case R.id.btnADVocabulary:
                startActivity(new Intent(this, AlphabetActivity.class).putExtra(BundleKeys.KEY_DESTINATION, 1));
                break;
            case R.id.ivBack:
                super.onBackPressed();
                break;
        }
    }
}
