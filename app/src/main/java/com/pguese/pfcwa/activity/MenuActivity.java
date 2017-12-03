package com.pguese.pfcwa.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.pguese.pfcwa.R;
import com.pguese.pfcwa.widgets.ButtonCG;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MenuActivity extends BaseActivity {

    @BindView(R.id.btnFC)
    ButtonCG btnFC;
    @BindView(R.id.btnAD)
    ButtonCG btnAD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);

//        startActivity(new Intent(this, FlashcardActivity.class));

    }

    @OnClick({R.id.btnFC, R.id.btnAD})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnFC:
                startActivity(new Intent(this, AlphabetActivity.class));
                break;
            case R.id.btnAD:
                break;
        }
    }
}
